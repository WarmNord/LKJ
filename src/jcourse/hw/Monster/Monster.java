package jcourse.hw.Monster;

public class Monster {

    int eye;
    int leg;
    int hand;

    public Monster() {

        eye = 2;
        leg = 2;
        hand = 2;

    }

    public Monster(int eye) {
        this.eye = eye;
        leg = 2;
        hand = 2;
    }

    public Monster(int eye, int leg) {
        this.eye = eye;
        this.leg = leg;
        hand = 2;
    }

    public Monster(int eye, int leg, int hand) {
        this.eye = eye;
        this.leg = leg;
        this.hand = hand;
    }

    void voice(){
        System.out.println("Голос");
    }

    void voice(int i) {
        for (int l = 0; l <= i; l++) {

            System.out.println("Голос");
        }
    }

    void voice(int i, String word) {

        for (int o = 0; o <= i; o++) {

            System.out.println(word);
        }
    }


}
