package chain;

public class AvailabilityCheck extends OrderCheck {
    @Override
    protected boolean process(Order order) {
        if (!order.isInStock()) {
            System.out.println("Ошибка: товара нет в наличии");
            return false;
        }
        System.out.println("Проверка наличия пройдена");
        return true;
    }
}
