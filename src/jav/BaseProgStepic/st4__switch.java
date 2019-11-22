package jav.BaseProgStepic;

import java.util.Scanner;

public class st4__switch {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String month = sc.nextLine();

        switch (month) {
            case "1":
                System.out.println("31");
                break;
            case "3":
                System.out.println("31");
                break;
            case "5":
                System.out.println("31");
                break;
            case "7":
                System.out.println("31");
                break;
            case "8":
                System.out.println("31");
                break;
            case "10":
                System.out.println("31");
                break;
            case "12":
                System.out.println("31");
                break;
            case "2":
                System.out.println("29");
                break;

            default:
                System.out.println("30");

        }

    }
}
