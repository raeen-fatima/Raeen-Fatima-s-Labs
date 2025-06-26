import java.io.*;
import java.util.*;
public static List<Product> loadProducts(String filepath) {
    List<Product> products = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            int id = Integer.parseInt(data[0]);
            String name = data[1];
            double price = Double.parseDouble(data[2]);
            String desc = data[3];
            String img = data[4];
            products.add(new Product(id, name, price, desc, img));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return products;
}


