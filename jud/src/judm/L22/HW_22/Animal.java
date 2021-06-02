package judm.L22.HW_22;

public class Animal {


    public Animal() {
        System.out.println("I'm animal");
    }

    int eyes;

    void eat() {
        System.out.println("Animal eat");
    }

    void drink() {
        System.out.println("Animal drink");
    }

    ;
}

class Pet extends Animal {

    public Pet() {
        System.out.println("I'm pet");
        eyes = 2;
    }
    String name;
    int tail = 1;
    int paw = 4;

    void run() {
        System.out.println("Pet runs");
    }

    void jump() {
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet {


    public Dog(String name) {
        this.name = name;
        System.out.println("I'm a god and my name is: " + name);
    }

    void play() {
        System.out.println("Dog plays");
    }
}

class Cat extends Pet {

    public Cat(String name) {
        this.name = name;
        System.out.println("I'm a cat and my name is: " + name);
    }

    void sleep() {
        System.out.println("Cat sleeps");
    }

}

class Test {
    public static void main(String[] args) {
        Dog d = new Dog("V");
    }
}