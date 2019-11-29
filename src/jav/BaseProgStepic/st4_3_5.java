package jav.BaseProgStepic;



import java.util.Scanner;

public class st4_3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if ((a % 10) % 2 == 0) {
            System.out.println("YES");

        } else{
            System.out.println("NO");
        }
    }
}
