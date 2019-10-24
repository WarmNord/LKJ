package jcourse.hw;
import java.util.Scanner;

public class HW09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();

/**
         if (month.equals("Январь") ) {
         System.out.println("Зима");
         }
         else if (month.equals("Февраль")) {
         System.out.println("Зима");

         }
         else {
         System.out.println("Ничего");

         } */

            switch (month) {

                case "Январь" :
                    System.out.println("Зима");
                    break;
                default:
                    System.out.println("ничего");
            }

    }

}

