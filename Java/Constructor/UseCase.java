package Constructor;

 class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void showDetails() {
        System.out.println("Product: " + name + ", Price: ₹" + price);
    }
}

public class UseCase {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Headphones", 1500);

        p1.showDetails(); // Product: Laptop, Price: ₹55000
        p2.showDetails(); // Product: Headphones, Price: ₹1500

    }
}

