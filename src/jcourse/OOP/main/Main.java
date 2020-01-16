package jcourse.OOP.main;

import jcourse.OOP.box.Box;
import jcourse.OOP.box.Man;
import jcourse.OOP.test.Empty;

public class Main {

    public static void main(String[] args) {


        Box box2 = new Box();
        box2.height = 5;
        box2.length = 5;
        box2.width = 5;

        Box box3 = new Box();
        box3.height = 8;
        box3.length = 8;
        box3.width = 8;



        double vol2 = box2.length * box2.height * box2.width;

        double vol3 = box3.length * box3.height * box3.width;

        box2.volume();

        box3.volume();
    }
}
