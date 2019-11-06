package jav;

public class Main {

    private static String name = null;

    public static void main(String[] args) {
        if (name != null) {
            System.out.println(name.length());
        } else {
            System.out.println("null");
        }
    }
}
