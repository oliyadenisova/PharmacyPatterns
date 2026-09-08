package decorator;

import strategy.DeliveryStrategy;

// Абстрактный класс-декоратор для добавления функций доставки

public abstract class DeliveryDecorator implements DeliveryStrategy {
   protected DeliveryStrategy delivery;

    public DeliveryDecorator(DeliveryStrategy delivery) {
        this.delivery = delivery;
    }

    @Override
    public abstract void deliver();
}
