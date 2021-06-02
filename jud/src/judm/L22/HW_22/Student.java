package judm.L22.HW_22;

public class Student {
    public Student(StringBuilder name, int course, int grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name);
        return name2;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >=1 && course <= 4  ) {
            this.course = course;
        }

    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >=1 && grade <= 10  ) {
            this.grade = grade;
        }
    }

    void showInfo() {
        System.out.println("Name " + getName());
        System.out.println("Course " + getCourse());
        System.out.println("Grade " + getGrade());
    }

}

class testStudent {

    public static void main(String[] args) {
        Student student = new Student(new StringBuilder("Igor"),2,5);
        student.showInfo();
    }

}
