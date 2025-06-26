import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProductCard extends JPanel {
    public ProductCard(Product product, CartService cartService, DefaultListModel<String> cartListModel, JLabel totalLabel) {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        setPreferredSize(new Dimension(200, 220));

        // Product Image
        ImageIcon icon = new ImageIcon(product.getImagePath());
        Image img = icon.getImage().getScaledInstance(180, 100, Image.SCALE_SMOOTH);
        JLabel imageLabel = new JLabel(new ImageIcon(img));
        add(imageLabel, BorderLayout.NORTH);

        // Product Info
        JPanel infoPanel = new JPanel(new GridLayout(3, 1));
        infoPanel.add(new JLabel(product.getName()));
        infoPanel.add(new JLabel("₹" + product.getPrice()));
        infoPanel.add(new JLabel("<html><i>" + product.getDescription() + "</i></html>"));
        add(infoPanel, BorderLayout.CENTER);

        // Add to Cart Button
        JButton addButton = new JButton("Add to Cart");
        addButton.addActionListener(e -> {
            cartService.addToCart(product);
            cartListModel.clear();
            for (CartItem item : cartService.getCartItems()) {
                cartListModel.addElement(item.toString());
            }
            totalLabel.setText("Total: ₹" + cartService.getTotalAmount());
        });
        add(addButton, BorderLayout.SOUTH);
    }
}
