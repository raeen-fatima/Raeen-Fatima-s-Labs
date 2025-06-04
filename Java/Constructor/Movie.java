package Constructor;
public class Movie {
    String name;
    double rating;

    // Default Constructor
    Movie() {
        name = "Default Movie";
        rating = 5.0;
    }

    // Parameterized Constructor
    Movie(String n, double r) {
        name = n;
        rating = r;
    }

    void displayMovie() {
        System.out.println("Movie: " + name + ", Rating: " + rating);
    }

    public static void main(String[] args) {
        Movie m1 = new Movie();
        Movie m2 = new Movie("Inception", 9.2);

        m1.displayMovie();
        m2.displayMovie();
    }
}
