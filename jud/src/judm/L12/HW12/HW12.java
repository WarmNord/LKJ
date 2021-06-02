package judm.L12.HW12;

import judm.L11.Student;

public class HW12 {

    public void cmpStudents(Student s1, Student s2) {
        if (s1.name.equals(s2.name) && s1.course == s2.course && s1.grade == s2.grade) {
            System.out.println("Students are equals");
        } else System.out.println("Students are not equals");
    }

    public void cmpStudentsStep(Student s1, Student s2) {
        if (s1.name.equals(s2.name)) {
            if (s1.course == s2.course) {
                if (s1.grade == s2.grade) {
                    System.out.println("Students are not equals");
                }
                System.out.println("Grades isn't equals");
            } else System.out.println("Courses isn't equals");
        } else System.out.println("Names isn't equals");
    }
}
