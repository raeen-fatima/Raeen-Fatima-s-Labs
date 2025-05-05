//Write a Java program to:
//Declare 2 integers x = 12, y = 4
//Perform all 5 arithmetic operations
//Compare them using relational operators
//Use a ternary operator to print the smaller number

public class Operator {
    public static void main(String[] args) {
        int x  = 12, y = 4;
        //arithmatic operator
        System.out.println("add:" + (x + y));
        System.out.println("sub:" + (x - y));
        System.out.println("mul:" + (x * y));
        System.out.println("div:" + (x / y));
        System.out.println("mod:" + (x % y));
        //compare them using relational operator
        System.out.println("x  > y ? " + (x > y));
        //use a ternary no to print the smaller number
        String result = (x < y) ? " x is smaller" : (x > y ? " y is smaller" : " Both are equal");
        System.out.println("Result:" + result);

        
    }
}
