package strategy;

// метод доставки — самовывоз

public class PickupDelivery implements DeliveryStrategy {
    @Override
    public void deliver() {
        System.out.println("Заказ подготовлен для самовывоза");
    }
}
