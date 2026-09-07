package chain;

public class AddressCheck extends OrderCheck {
    @Override
    protected boolean process(Order order) {
        if (!order.isAddressCorrect ()){
            System.out.println("Ошибка: адрес введен не верно");
            return false;
        }
        System.out.println("Проверка корректного ввода адреса пройдена");
        return true;
    }
}
