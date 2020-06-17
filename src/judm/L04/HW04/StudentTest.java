package judm.L04.HW04;

public class StudentTest {

    double avg(Student s) {
        double avg = (s.econ + s.math + s.lang) / 3;
        System.out.println(s.first_name + s.last_name + ": " + avg);
        return avg;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.sntID = 1;
        s1.first_name = "S";
        s1.last_name = "1";
        s1.year = 2017;
        s1.math = 4.3;
        s1.econ = 5.0;
        s1.lang = 4.5;

        s2.sntID = 1;
        s2.first_name = "S";
        s2.last_name = "2";
        s2.year = 2010;
        s2.math = 4.0;
        s2.econ = 3.0;
        s2.lang = 4.0;

        s3.sntID = 1;
        s3.first_name = "S";
        s3.last_name = "3";
        s3.year = 2018;
        s3.math = 3.3;
        s3.econ = 3.0;
        s3.lang = 5.0;


        s1.printAvg();
        s2.printAvg();
        s3.printAvg();

        System.out.println(s1.first_name + s1.last_name + ": " + ((s1.math + s1.econ + s1.lang) / 3));
        System.out.println(s2.first_name + s2.last_name + ": " + ((s2.math + s2.econ + s2.lang) / 3));
        System.out.println(s3.first_name + s3.last_name + ": " + ((s3.math + s3.econ + s3.lang) / 3));

        StudentTest sTest = new StudentTest();
        sTest.avg(s1);
        sTest.avg(s2);
        sTest.avg(s3);


    }
}
