package strategy;

// Стратегия доставки — постамат

public class PostamatDelivery implements DeliveryStrategy {

    @Override
    public void deliver() {System.out.println("Заказ помещен в постамат");
    }
}
