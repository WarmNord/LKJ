package jcourse.hw;

public class stepic {

    public static void main(String[] args) {


        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = false;

        boolean b4 = b1 ^ !b3 & b2;
        boolean b5 = b1 ^ !b3 && b2;

        int number = 990;
        boolean result = number > 1000 || number % 10 == 0;

        System.out.println(result);

    }

}
