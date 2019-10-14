package jcourse.hw;
import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextFloat();
        double b = sc.nextFloat();

        double x = Math.pow(a , 2) + Math.pow(b , 2);

        double c = Math.sqrt(x);
        System.out.println(x);
    }
}
