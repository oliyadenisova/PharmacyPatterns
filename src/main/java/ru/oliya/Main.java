package ru.oliya;

import builder.Product;
import chain.*;
import proxy.PrescriptionProxy;
import strategy.*;
import decorator.EveningDelivery;
import decorator.ExpressDelivery;
import adapter.ExternalMedicalApi;
import adapter.PrescriptionAdapter;
import adapter.PrescriptionPrinter;
import adapter.PrescriptionService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Пример использования паттерна Strategy:
        // Заказ будет доставлен курьером

        DeliveryStrategy deliveryStrategy = new CourierDelivery();
        OrderService orderService = new OrderService(deliveryStrategy);
        orderService.deliverOrder();

        // Заказ помещен в постамат

        DeliveryStrategy deliveryStrategy1 = new PostamatDelivery();
        OrderService orderService1 = new OrderService(deliveryStrategy1);
        orderService1.deliverOrder();

        // Заказ подготовлен для самовывоза

        DeliveryStrategy deliveryStrategy2 = new PickupDelivery();
        OrderService orderService2 = new OrderService(deliveryStrategy2);
        orderService2.deliverOrder();

        // Заказ передан в СДЭК

        DeliveryStrategy deliveryStrategy3 = new CdekDelivery();
        OrderService orderService3 = new OrderService(deliveryStrategy3);
        orderService3.deliverOrder();

        System.out.println();

        // Пример использования паттерна Декоратор:
        // Обертка курьер + экспресс доставка

        DeliveryStrategy delivery = new ExpressDelivery(new CourierDelivery());
        orderService = new OrderService(delivery);
        orderService.deliverOrder();

        System.out.println();

        // Обертка курьер + вечерняя доставка

        DeliveryStrategy delivery1 = new EveningDelivery(new CourierDelivery());
        orderService1 = new OrderService(delivery1);
        orderService1.deliverOrder();

        System.out.println();

        // Обертка курьер + экспресс доставка + вечерняя доставка

        DeliveryStrategy delivery2 =
                new EveningDelivery(new ExpressDelivery(new CourierDelivery()));
        orderService2 = new OrderService(delivery2);
        orderService2.deliverOrder();

        System.out.println();

        // Пример использования паттерна Chain of Responsibility:
        // на примере цепочки обработки заказа
        // (авторизация -> наличие товара -> наличие рецепта -> адрес)

        AuthorizationCheck authorizationCheck = new AuthorizationCheck();
        AvailabilityCheck availabilityCheck = new AvailabilityCheck();
        PrescriptionCheck prescriptionCheck = new PrescriptionCheck();
        AddressCheck addressCheck = new AddressCheck();

        Order order = new Order(true,
                true, true, true);

        authorizationCheck.setNext(availabilityCheck);
        availabilityCheck.setNext(prescriptionCheck);
        prescriptionCheck.setNext(addressCheck);

        authorizationCheck.check(order);

        System.out.println();

        // Пример использования паттерна Builder:
        // на примере сборки 2-х продуктовых карточек

        Product product = new Product.Builder()
                .name("Парацетамол")
                .dosage("500 мг")
                .manufacturer("Фармстандарт, РФ")
                .price(150)
                .rating(4.8)
                .thermolabileDrug(false)
                .prescriptionRequired(false)
                .deliveryAvailable(true)
                .build();
        product.printProduct();

        System.out.println();

        Product product1 = new Product.Builder()
                .name("Нурофен")
                .dosage("400 мг")
                .manufacturer("Санофи, Франция")
                .price(359)
                .rating(4.4)
                .thermolabileDrug(false)
                .prescriptionRequired(false)
                .deliveryAvailable(true)
                .build();
        product1.printProduct();

        System.out.println();

        // Пример совместного использования паттернов Adapter и Proxy

        PrescriptionService adapter = new PrescriptionAdapter(new ExternalMedicalApi());
        PrescriptionService prescriptionService = new PrescriptionProxy(adapter, true);

        PrescriptionPrinter.printResult(prescriptionService, "RX-458_1");
        PrescriptionPrinter.printResult(prescriptionService, "RX-123");

        System.out.println();
    }
}