package judm.L22;

public class Human {

/*    public Human(String name) {
        this.name = name;
    }*/

    String name;
    static int salary = 150;

    void work() {
        System.out.println("Work");
    }

    static void rest(){
        System.out.println("Take it easyyy");
    }
}

class Student extends Human {

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
}
