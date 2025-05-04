package Java;
import java.util.Scanner;
public class UsingScanner {
    public static void main(String[] args) {
        Scanner Bio = new Scanner(System.in);

        System.out.println(" Name ");
        String Name = Bio.next();
        System.out.println("Age: ");
        int age = Bio.nextInt();
        System.out.println("FavTech: ");
        String FavTech = Bio.next();
        System.out.println("Dream: ");
        String Dream = Bio.next();

        System.out.println("Hi, I'm " + Name + " I'm " + age + " years old and I Love " + FavTech + " My Dream is To " + Dream);


    }
}