package judm.L15;

import java.sql.SQLOutput;

public class Test7 {
    public static void main(String[] args) {
        int money = 100;

        do {
            System.out.println("Where is money ?");
            System.out.println("OOPS");
            money -= 10;

        } while (money > 50);
    }
}
