package jav.BaseProgStepic;

import java.util.Scanner;

public class sss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int a1 = a / 100;
        int a2 = a % 100 / 10;
        int a3 = a % 10;

        if (a2 > a1) {
            if (a3 > a2) {
                System.out.println("YES");
            } else  {
                System.out.println("NO");
            }
        } else  {
            System.out.println("NO");
        }
    }
}
