//Suppose you want to throw an exception when the bank account balance falls below a minimum limit (say 1000). 
//None of Java’s built-in exceptions directly represent this, so you create your own.

package Exceptions;
// User-defined Exception class
 class LowBalanceException extends Exception {
    LowBalanceException(String message) {
        super(message);  // Pass the message to Exception class
    }
}

public class BankException {
    private static int[] accno = {101, 102, 103, 104};
    private static String[] name = {"Nisha", "Shubham", "Sushant", "Abhinav"};
    private static double[] bal = {20000.0, 22000.0, 4600.0, 888.0};

    public static void main(String[] args) {
        try {
            System.out.println("ACCNO\tCUSTOMER NAME\tBALANCE");
            for (int i = 0; i < bal.length; i++) {
                System.out.println(accno[i] + "\t" + name[i] + "\t" + bal[i]);
                if (bal[i] < 1000) {
                    throw new LowBalanceException("Balance is less than 1000 for account " + accno[i]);
                }
            }
        } catch (LowBalanceException e) {
            e.printStackTrace();
        }
    }
}

//OUTPUT:

// ACCNO	CUSTOMER NAME	BALANCE
// 101	Nisha	        20000.0
// 102	Shubham	        22000.0
// 103	Sushant	        4600.0
// 104	Abhinav	        888.0
// java LowBalanceException: Balance is less than 1000 for account 104
// 	at BankDemo.main(BankDemo.java:19)
