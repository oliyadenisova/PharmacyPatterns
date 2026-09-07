package strategy;

// Стратегия доставки — СДЭК

public class CdekDelivery implements DeliveryStrategy{

    @Override
    public void deliver() {
        System.out.println("Заказ передан в СДЭК");
    }
}
