import java.util.*;

public class CartService {
    private List<CartItem> cart = new ArrayList<>();

    public void addToCart(Product product) {
        for (CartItem item : cart) {
            if (item.product.getId() == product.getId()) {
                item.quantity++;
                return;
            }
        }
        cart.add(new CartItem(product, 1));
    }

    public List<CartItem> getCartItems() {
        return cart;
    }

    public double getTotalAmount() {
        return cart.stream().mapToDouble(CartItem::getTotal).sum();
    }

    public void clearCart() {
        cart.clear();
    }
}
