package BridgeLabz_Day29_Generics.OnlineMarketplace;

public class MarketplaceMain {
    public static void main(String[] args) {
        Book book = new Book(500);
        Clothing cloth = new Clothing(1000);
        Discount.applyDiscount(book, 10);
        Discount.applyDiscount(cloth, 20);
    }
}