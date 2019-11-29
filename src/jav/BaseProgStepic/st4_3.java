package jav.BaseProgStepic;


import java.util.Scanner;

/*
По данному трехзначному числу, определите образуют ли цифры данного числа возрастающую последовательность.

 */
public class st4_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int a1 = a / 100;
        int a2 = a % 100 / 10;
        int a3 = a % 10;

        if (a1 <= a2) {
            if (a2 <= a3){
                System.out.println("YES");
            }
        }
        else {
            System.out.println("NO");
        }


    }
}
