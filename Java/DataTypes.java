public class DataTypes {
    public static void main (String[] args) {
        //Integer Types
        byte byteVal = 10;
        short shortVal = 100;
        int intVal = 1000;
        long longVal = 1000000L;

        //Floating- point types 
        float floatVal = 10.5f;
        double doubleVal = 20.99;

        //Character type
        char charVal = 'A';

        //Boolean type 
        boolean isActive = true;
         
        //String Type
        String greeting = "Hello , Java";

        //Arrays 
        int[] num = {1, 2, 3, 4, 5};

        //Displaying Values
        System.out.println("byte: " + byteVal);
        System.out.println("short: " + shortVal);
        System.out.println("int: " + intVal);
        System.out.println("long: " + longVal);
        System.out.println("float: " + floatVal);
        System.out.println("double: " + doubleVal);
        System.out.println("char: " + charVal);
        System.out.println("boolean: " + isActive);
        System.out.println("string: " + greeting);
        System.out.println("Array: " + num[2]);

    }
}