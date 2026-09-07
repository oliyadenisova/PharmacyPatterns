package strategy;

public class CourierDelivery implements DeliveryStrategy {
    @Override
    public void deliver() {
        System.out.println("Заказ доставлен курьером");
    }
}

