package decorator;

import strategy.DeliveryStrategy;

// Пример обретки дополнительной функции «Вечернаяя доставка»

public class EveningDelivery extends DeliveryDecorator {

    public EveningDelivery(DeliveryStrategy delivery) {
        super(delivery);
    }

    @Override
    public void deliver() {
        delivery.deliver();
        System.out.println("Добавить вечернюю достаку");
    }
}