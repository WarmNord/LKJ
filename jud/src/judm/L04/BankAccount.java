package judm.L04;

public class BankAccount {

    int id;
    String name;
    double balance;

    void iBalance(double m) { balance += m; }

    void mBalance(double m) {
        balance -= m;
    }

}

class BankAccountTest {
    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Z";
        MyAccount.balance = 12.35;

        YourAccount.id = 2;
        YourAccount.name = "M";
        YourAccount.balance = 2.0;

        HisAccount.id = 1;
        HisAccount.name = "I";
        HisAccount.balance = 124.12;

        System.out.println(HisAccount.balance);
    }
}