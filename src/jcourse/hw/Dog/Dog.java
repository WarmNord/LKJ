package jcourse.hw.Dog;

public class Dog {

    String name;
    String typeDog;
    int speed;

    void run() {

        String a = " ";

        for (int i = 0; i < speed; i++) {

            a += "Бегу";
            if (i == speed - 1) {
                a += ".";
            } else {
                a += ", ";
            }


            System.out.println(a);


        }
    }

    String info() {

        return name + " " + typeDog + " " + speed;
    }
}
