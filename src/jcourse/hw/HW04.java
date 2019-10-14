package jcourse.hw;

public class HW04 {
    public static void main(String[] args) {

        int time = 2;
        boolean isGoodWeather = true;
        boolean late = time >= 23 || time <=5;

        if (late) {
            System.out.println("Sleep");
        }
        if (!late && isGoodWeather) {
            System.out.println("Go walk");
    }
        if (!late && !isGoodWeather) {
            System.out.println("Read book");
        }
}}
