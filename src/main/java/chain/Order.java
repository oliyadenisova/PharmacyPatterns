package chain;

// Модель заказа с данными для последовательной проверки

public class Order {
    private boolean authorized;
    private boolean inStock;
    private boolean prescription;
    private boolean addressCorrect;

    public Order(boolean authorized, boolean inStock, boolean prescription, boolean addressCorrect) {
        this.authorized = authorized;
        this.inStock = inStock;
        this.prescription = prescription;
        this.addressCorrect = addressCorrect;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public boolean isInStock() {
        return inStock;
    }

    public boolean isPrescription() {
        return prescription;
    }

    public boolean isAddressCorrect() {
        return addressCorrect;
    }
}