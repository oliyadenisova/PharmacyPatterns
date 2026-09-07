package chain;

public class AuthorizationCheck extends OrderCheck {

    @Override
    protected boolean process(Order order) {

        if (!order.isAuthorized()) {
            System.out.println("Ошибка: пользователь не авторизован");
            return false;
        }

        System.out.println("Проверка авторизации пройдена");
        return true;
    }

}
