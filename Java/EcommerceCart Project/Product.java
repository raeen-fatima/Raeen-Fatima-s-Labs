public class Product {
    int id;
    String name;
    double price;
    String description;
    String imagePath;

    public Product(int id, String name, double price, String description, String imagePath) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.imagePath = imagePath;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getDescription() { return description; }
    public String getImagePath() { return imagePath; }
}
