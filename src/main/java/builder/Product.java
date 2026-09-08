package builder;

public class Product {
    private String name;
    private String dosage;
    private String manufacturer;
    private double price;
    private double rating;
    private boolean thermolabileDrug;
    private boolean prescriptionRequired;
    private boolean deliveryAvailable;

    public static class Builder {
        private String name;
        private String dosage;
        private String manufacturer;
        private double price;
        private double rating;
        private boolean thermolabileDrug;
        private boolean prescriptionRequired;
        private boolean deliveryAvailable;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder dosage(String dosage) {
            this.dosage = dosage;
            return this;
        }

        public Builder manufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder rating(double rating) {
            this.rating = rating;
            return this;
        }

        public Builder thermolabileDrug(boolean thermolabileDrug) {
            this.thermolabileDrug = thermolabileDrug;
            return this;
        }

        public Builder prescriptionRequired(boolean prescriptionRequired) {
            this.prescriptionRequired = prescriptionRequired;
            return this;
        }

        public Builder deliveryAvailable(boolean deliveryAvailable) {
            this.deliveryAvailable = deliveryAvailable;
            return this;
        }

        public Product build() {
            return new Product(this);
         }

    }
    public Product(Builder builder) {
        this.name = builder.name;
        this.dosage = builder.dosage;
        this.manufacturer = builder.manufacturer;
        this.price = builder.price;
        this.rating = builder.rating;
        this.thermolabileDrug = builder.thermolabileDrug;
        this.prescriptionRequired = builder.prescriptionRequired;
        this.deliveryAvailable = builder.deliveryAvailable;
    }

    public String getName() {
        return name;
    }

    public String getDosage() {
        return dosage;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public boolean isThermolabileDrug() {
        return thermolabileDrug;
    }

    public boolean isPrescriptionRequired() {
        return prescriptionRequired;
    }

    public boolean isDeliveryAvailable() {
        return deliveryAvailable;
    }

    public void printProduct() {
        System.out.println("Наименование: " + name);
        System.out.println("Дозировка: " + dosage);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Цена: " + price);
        System.out.println("Рейтинг товара: " + rating);
        System.out.println("Термолабильный препарат: "
                + (thermolabileDrug ? "Да" : "Нет"));
        System.out.println("Требуется рецепт: "
                + (prescriptionRequired ? "Да" : "Нет"));
        System.out.println("Доставка доступна: "
                + (deliveryAvailable ? "Да" : "Нет"));
    }

}

