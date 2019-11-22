package jav.BaseProgStepic;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class st4_2ur {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double D = Math.pow(b,2) - (4 * a *c);

        if (D > 0) {

            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);

            if (x1 > x2) {
                System.out.println(x2 +" "+ x1);
            } else {
                System.out.println(x1 +" "+ x2);
            }

        } else if (D == 0){

            System.out.println(-b / (2 * a));

        }

       // System.out.println(D);



    }
}
