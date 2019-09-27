package jcourse;

/**
 * >500 - pizza
 * 300<=money<=500 - hot dog
 * 100<=money<=300 - hamburger
 * money < 100 - water
 *
 *  int countOfMoney = 200;
 *         if (countOfMoney >= 500) {
 *             System.out.println("Пицца");
 *         } else if (countOfMoney >= 300) {
 *             System.out.println("Шаурма");
 *         } else if (countOfMoney >= 100) {
 *             System.out.println("Гамбургер");
 *         } else {
 *             System.out.println("Доширак");
 *         }
 *
 */
public class HW02 {
    public static void main(String[] args) {
        int a = 5;
        if (a >= 500) {
            System.out.println("Pizza");
        }
        else if ((300 <= a) && ( a < 500)) {
            System.out.println("Hot Dog");
        }
        else if ((a >= 100) && (a < 300)) {
            System.out.println("Hamburger");
        } else {
            System.out.println("Water");
        }
    }

}
