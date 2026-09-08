package decorator;

import strategy.DeliveryStrategy;

// Декоратор для добавления экспресс-доставки

public class ExpressDelivery extends DeliveryDecorator {

    public ExpressDelivery(DeliveryStrategy delivery) {
        super(delivery);
    }

    @Override
    public void deliver() {
        delivery.deliver();
        System.out.println("Добавить экспресс-достаку");
    }
}
