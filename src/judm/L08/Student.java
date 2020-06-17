package judm.L08;

public class Student {
    String name;
    int course;
    static int count;
    int a;

    public Student(String n, int c) {
        count++;
        name = n;
        course = c;

        System.out.println("Student #" +count + " created");
    }

    public static void showCount(){
        System.out.println(count);
    }

    public void showInfo(){
        System.out.println("Welcome to the student class!");
    }

    void abc() {
        a++;
        count++;
    }

    static void abcd(){
        count++;

    }

    public static void main(String[] args) {



    }

}
