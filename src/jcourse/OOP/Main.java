package jcourse.OOP;

public class Main {

    public static void main(String[] args) {

        Box myBox = new Box();
        myBox.height = 10.2;
        myBox.length = 15;
        myBox.width = 14.3;

        Box box2 = new Box();
        box2.width = 5;
        box2.height = 5;
        box2.length = 5;

        Box box3 = new Box();
        box3.length = 10;
        box3.height = 10;
        box3.width = 10;

        double volume = myBox.height * myBox.height * myBox.width;

        double volume2 = box2.width * box2.height * box2.length;
        double volume3 = box3.height * box3.width * box3.length;

        System.out.println(volume);
        System.out.println(volume2);
        System.out.println(volume3);


    }
}
