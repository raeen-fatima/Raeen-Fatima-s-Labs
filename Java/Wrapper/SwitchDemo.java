package Wrapper;
public class SwitchDemo {
    public static void main(String[] args) {
        Integer value = 2;

        switch(value) { // auto-unboxed to int
            case 1: System.out.println("One"); break;
            case 2: System.out.println("Two"); break;
            default: System.out.println("Invalid");
        }
    }
}

