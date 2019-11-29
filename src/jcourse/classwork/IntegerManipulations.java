package jcourse.classwork;

public class IntegerManipulations {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = a + b;
        c = c + 5;
        c = c * 10;
        a = 10;
        b = 3;
        c = a % b;
        c += 5;

        int z = 65421;

        System.out.println(z % 1000 / 100);
    }
}
