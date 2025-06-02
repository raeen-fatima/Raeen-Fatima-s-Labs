package MyPackageDemo;

class Statement {
    String name;
    double bal;

     Statement(String n, double b) {
        name = n;
        bal = b;
    }
    void show() {
        if (bal < 0)
         System.out.println("--> ");
         System.out.println(name + ": $" + bal);
    }
}

class AccountStatement {
    public static void main(String[] args) {
        Statement current[] = new Statement[3];

        current[0] = new Statement("Ravi", 123.23);
        current[1] = new Statement("Will Tell", 157.02);
        current[2] = new Statement("Suresh", -12.33);

        for (int i = 0; i < 3; i++)
        current[i].show();
    }
}