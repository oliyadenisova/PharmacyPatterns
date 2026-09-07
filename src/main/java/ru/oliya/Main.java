package ru.oliya;

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
    }
}