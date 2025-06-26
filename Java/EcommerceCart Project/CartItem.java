public class CartItem {
    Product product;
    int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotal() {
        return product.getPrice() * quantity;
    }

    public String toString() {
        return product.getName() + " x " + quantity + " = ₹" + getTotal();
    }
}
