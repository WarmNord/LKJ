package judm.L22;

public class Test4 {
}

class Human2 {
    Human2(String name) {
        this(name, null);
    }

    Human2(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    String name;
    String surName;

}

class S2 extends Human2 {
    S2() {
        super("Ivan");
    }

    public static void main(String[] args) {
        S2 s = new S2();
    }

}