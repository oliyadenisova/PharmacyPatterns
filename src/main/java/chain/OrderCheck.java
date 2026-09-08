package chain;

// Базовый класс для последовательной проверки заказа

public abstract class OrderCheck {

    private OrderCheck next;

    public OrderCheck setNext(OrderCheck next) {
        this.next = next;
        return next;
    }

    public void check(Order order){
        if (process(order) && next != null) {
            next.check(order);
        }
    }

    protected abstract boolean process(Order order);
}
