package BridgeLabz_Day33_ScenarioBased.SmartCheckout;

public class SmartCheckoutMain {
    public static void main(String[] args) {
        CheckoutCounter counter = new CheckoutCounter();
        counter.addCustomer(new Customer("Naman", new String[]{ "Milk", "Bread" }));
        counter.addCustomer(new Customer("Bhavy", new String[]{ "Rice", "Milk" }));
        counter.processNextCustomer();
        counter.processNextCustomer();
    }
}
