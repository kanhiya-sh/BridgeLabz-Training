package Capgemini_Day12_class_object;

class MobilePhone {
    private String brand;
    private String model;
    private double price;

    MobilePhone(String brand, String model, double price) { // Constructor to initialize mobile phone details
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Brand of mobile: " + brand);
        System.out.println("Model of mobile: " + model);
        System.out.println("Price of mobile: " + price);
        System.out.println("------------------------------");
    }
}

public class MobilePhoneDetails {
    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone("VIVO", "VIVO V29", 15999);
        MobilePhone m2 = new MobilePhone("ONE PLUS", "ONE PLUS nord4", 39999);
        MobilePhone m3 = new MobilePhone("APPLE", "iphone pro16", 79999);

        m1.display();
        m2.display();
        m3.display();
    }
}
