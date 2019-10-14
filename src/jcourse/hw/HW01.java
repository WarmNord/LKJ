package jcourse.hw;

public class HW01 {

    public static void main(String[] args) {

        int sec = 1000000;
        int secondsInMinutes = 60;
        int secondsInHours = secondsInMinutes * 60;
        int secondsInDays = secondsInHours * 24;

        int days = sec / secondsInDays;
        int hours = (sec % secondsInDays) / secondsInHours;
        int minutes = ((sec % secondsInDays) % secondsInHours / secondsInMinutes);
        int leftSeconds = sec - days * secondsInDays - hours * secondsInHours - minutes * secondsInMinutes;

        System.out.println("Дано количество секунд: " + sec);
        System.out.println("Это равно");
        System.out.println("Дней: " + days);
        System.out.println("Часов: " + hours);
        System.out.println("Минут: " + minutes);
        System.out.println("Секунд: " + leftSeconds);

    }

}