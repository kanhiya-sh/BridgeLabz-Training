package BridgeLabz_Day39_FunctionalInterfaces;

interface PaymentMethod {
    void pay(double amount);
}

class UPI implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid Rs" + amount + " via UPI");
    }
}

class CreditCard implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid Rs" + amount + " via Credit Card");
    }
}

class Wallet implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid Rs" + amount + " via Wallet");
    }
}

public class DigitalPaymentInterface {
    public static void main(String[] args) {
        PaymentMethod pymt = new UPI();
        pymt.pay(500);
    }
}
