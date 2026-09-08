package strategy;

public class OrderService {
    private DeliveryStrategy deliveryStrategy;

    public OrderService(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public void deliverOrder(){
        deliveryStrategy.deliver();
    }
}