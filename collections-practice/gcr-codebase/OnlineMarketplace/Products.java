package BridgeLabz_Day29_Generics.OnlineMarketplace;

abstract class Product {
    double price;
    Product(double price) {
        this.price = price;
    }
}
class Book extends Product {
    Book(double price) {
        super(price);
    }
}
class Clothing extends Product {
    Clothing(double price) {
        super(price);
    }
}
class Gadget extends Product {
    Gadget(double price) {
        super(price);
    }
}
class Discount {
    static <T extends Product> void applyDiscount(T product, double percent) {
        product.price -= product.price * percent / 100;
        System.out.println(product.price);
    }
}