package jav.BaseProgStepic;

import java.util.Scanner;

public class st4_2_switchWeater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String month = sc.nextLine();

        switch (month) {
            case "12":
            case "1":
            case "2":

                System.out.println("Зима");
                break;
            case "3":
            case "4":
            case "5":
                System.out.println("Весна");
                break;
            case "6":
            case "7":
            case "8":
                System.out.println("Лето");
                break;
            default:
                System.out.println("Осень");
        }
    }
}
