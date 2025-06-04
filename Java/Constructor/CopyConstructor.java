package Constructor;

class Book {
    String title;
    int pages;

    // Parameterized constructor
    Book(String t, int p) {
        title = t;
        pages = p;
    }

    // Copy constructor
    Book(Book b) {
        title = b.title;
        pages = b.pages;
    }

    void show() {
        System.out.println(title + " - " + pages + " pages");
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Book b1 = new Book("Java", 500);
        Book b2 = new Book(b1);  // copying b1 into b2

        b2.show();  // Output: Java - 500 pages
    }
}
    

