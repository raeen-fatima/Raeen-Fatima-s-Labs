import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("🛍️ Shopping Cart");
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1, 2));

        ProductService ps = new ProductService();
        List<Product> products = ps.loadProducts("D:/PROJECTS/CodeClouse/EcommerceCart/products.csv");
        CartService cartService = new CartService();

        DefaultListModel<String> cartListModel = new DefaultListModel<>();
        JList<String> cartList = new JList<>(cartListModel);
        JScrollPane cartScroll = new JScrollPane(cartList);

        JLabel totalLabel = new JLabel("Total: ₹0.00");
        JButton checkoutBtn = new JButton("Checkout");

        // === Left Panel: Product Cards ===
        JPanel productCardsPanel = new JPanel();
        productCardsPanel.setLayout(new GridLayout(0, 2, 10, 10)); // 2 columns

        for (Product p : products) {
            JPanel card = new JPanel(new BorderLayout());
            card.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            card.setPreferredSize(new Dimension(200, 200));

            // Image
            ImageIcon icon = new ImageIcon(p.getImagePath());
            Image img = icon.getImage().getScaledInstance(180, 100, Image.SCALE_SMOOTH);
            JLabel imgLabel = new JLabel(new ImageIcon(img));
            card.add(imgLabel, BorderLayout.NORTH);

            // Info
            JLabel nameLabel = new JLabel(p.getName());
            JLabel priceLabel = new JLabel("₹" + p.getPrice());
            JLabel descLabel = new JLabel("<html><i>" + p.getDescription() + "</i></html>");
            JPanel infoPanel = new JPanel(new GridLayout(3, 1));
            infoPanel.add(nameLabel);
            infoPanel.add(priceLabel);
            infoPanel.add(descLabel);
            card.add(infoPanel, BorderLayout.CENTER);

            // Button
            JButton addToCartBtn = new JButton("Add to Cart");
            addToCartBtn.addActionListener(e -> {
                cartService.addToCart(p);
                cartListModel.clear();
                for (CartItem item : cartService.getCartItems()) {
                    cartListModel.addElement(item.toString());
                }
                totalLabel.setText("Total: ₹" + cartService.getTotalAmount());
            });
            card.add(addToCartBtn, BorderLayout.SOUTH);

            productCardsPanel.add(card);
        }

        JScrollPane productScroll = new JScrollPane(productCardsPanel);

        // === Right Panel: Cart ===
        JPanel rightPanel = new JPanel(new BorderLayout());
        rightPanel.add(new JLabel("🛒 Cart"), BorderLayout.NORTH);
        rightPanel.add(cartScroll, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new FlowLayout());
        bottomPanel.add(totalLabel);
        bottomPanel.add(checkoutBtn);
        rightPanel.add(bottomPanel, BorderLayout.SOUTH);

        checkoutBtn.addActionListener(e -> {
            if (cartService.getCartItems().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Cart is empty.");
            } else {
                JOptionPane.showMessageDialog(frame, "Order placed! Total: ₹" + cartService.getTotalAmount());
                cartService.clearCart();
                cartListModel.clear();
                totalLabel.setText("Total: ₹0.00");
            }
        });

        frame.add(productScroll); // left panel
        frame.add(rightPanel);    // right panel (cart)

        frame.setVisible(true);
    }
}
