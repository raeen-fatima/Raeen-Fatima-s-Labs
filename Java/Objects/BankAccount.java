public class BankAccount {
    String name;
    double balance;

    BankAccount(String n, double b) {
        name = n;
        balance = b;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println(amt + " deposited.");
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println(amt + " withdrawn.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount("Fatima", 1000);
        ba.deposit(500);
        ba.withdraw(200);
        ba.displayBalance();
    }
}
