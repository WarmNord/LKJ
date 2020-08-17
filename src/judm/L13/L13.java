package judm.L13;

public class L13 {

}

class Student {
    int grade;

    public Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student s1 = new Student(3);
        switch (s1.grade) {
            case 2:
                System.out.println("Bad");
                break;
            case 3:
                System.out.println("Not Bad");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Very good");
                break;
            default:
                System.out.println("No data about grade");
        }
    }
}
