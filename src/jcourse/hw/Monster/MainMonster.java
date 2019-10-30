package jcourse.hw.Monster;

public class MainMonster {

    public static void main(String[] args) {
        Monster m1 = new Monster(1);
        Monster m2 = new Monster(8, 6);
        Monster m3 = new Monster(4, 6, 5);

        m1.voice();
        m2.voice(5);
        m3.voice(3, "ujkjc");

    }


}
