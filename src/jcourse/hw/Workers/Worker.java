package jcourse.hw.Workers;

public class Worker {
     String name;
     String position;
     int salary;

    public Worker(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    String info(int i) {

        return name + " " + position + " " +  i * salary;
    }


}
