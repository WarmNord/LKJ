package jav.BaseProgStepic;

import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class s4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int a1 = a / 1000;
        int a2 = a / 100 % 10;

        int a3 = a % 100 / 10;
        int a4 = a % 10;


        if (a1 == a4 && a2 == a3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
