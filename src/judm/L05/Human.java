package judm.L05;

public class Human {
    String name;
    Car3 car;
    BankAccount bA;

    void info(){
        System.out.println("Name: " + name + " Color: " + car.color  +" Balance: "+ bA.balance);
    }
}

class humanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "David";
        h.car = new Car3("Black","V7");
        h.bA = new BankAccount(1,4500.0);

        h.info();
    }
}

class Car3 {
    Car3(String c, String e) {
        color = c;
        engine = e;
    }
    String color;
    String engine;
}

class BankAccount {
    BankAccount(int i, double b) {
        id = i;
        balance = b;
    }
    int id;
    double balance;
}