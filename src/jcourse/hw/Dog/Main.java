package jcourse.hw.Dog;

public class Main {

    public static void main(String[] args) {

        Dog gav = new Dog();

        gav.speed = 10;
        gav.name = "Gaff";
        gav.typeDog = "staff";

        System.out.println(gav.info());

        gav.run();
    }
}
