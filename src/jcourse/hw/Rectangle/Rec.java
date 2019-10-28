package jcourse.hw.Rectangle;

public class Rec {

    int a;
    int b;

    void setAB(int a, int b) {

        this.a = a;
        this.b = b;
    }

    int perimetr() {
        return a * 2 + b * 2;
    }

    int plosh(){
        return a * b;
    }

}
