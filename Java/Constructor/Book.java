package Constructor;

    
public class Book {
    String title, author;
    double price;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Atomic Habits", "James Clear", 499);
        b1.displayBook();
    }
}

