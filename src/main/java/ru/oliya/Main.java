package ru.oliya;

import builder.Product;
import chain.*;
import strategy.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DeliveryStrategy deliveryStrategy = new CourierDelivery();
        OrderService orderService = new OrderService(deliveryStrategy);
        orderService.deliverOrder();

        DeliveryStrategy deliveryStrategy1 = new PostamatDelivery();
        OrderService orderService1 = new OrderService(deliveryStrategy1);
        orderService1.deliverOrder();

        DeliveryStrategy deliveryStrategy2 = new PickupDelivery();
        OrderService orderService2 = new OrderService(deliveryStrategy2);
        orderService2.deliverOrder();

        DeliveryStrategy deliveryStrategy3 = new CdekDelivery();
        OrderService orderService3 = new OrderService(deliveryStrategy3);
        orderService3.deliverOrder();

        System.out.println();

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
    }

}