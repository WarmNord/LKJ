package judm.L20;

import java.util.ArrayList;

public class Test1 {


    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hi");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        list.add("ok");

        ArrayList<String> l2 = new ArrayList(30);
        ArrayList<String> l5 = new ArrayList(l2);
        System.out.println(l2 == l5);
        l2.add("Goodbye");


    }
}

class Car {
}

class Student {
}
