package chain;

public class PrescriptionCheck extends OrderCheck {

    @Override
    protected boolean process(Order order) {
        if (!order.isPrescription()) {
            System.out.println("Ошибка: рецепт отсутствует");
            return false;
        }
        System.out.println("Проверка рецепта пройдена");
        return true;
    }
}
