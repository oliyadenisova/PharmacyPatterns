package strategy;

public class PostamatDelivery implements DeliveryStrategy {
    @Override
    public void deliver() {
        System.out.println("Заказ помещен в постамат");
    }
}
