package judm.L04.HW04;

public class Student {
    int sntID;
    String first_name;
    String last_name;
    int year;
    double math;
    double econ;
    double lang;

    Student(int id,String fN, String lN, int y, double m, double e, double l) {
        sntID = id;
        first_name = fN;
        last_name = lN;
        year = y;
        math = m;
        econ = e;
        lang = l;
    }

    Student(int id,String fN, String lN, int y) {
        this(id,fN,lN,y,0.0,0.0,0.0);
    }

    Student() {

    }

    void printAvg() {
        double avg = (this.math + this.econ + this.lang) / 3;
        System.out.println(this.first_name + this.last_name + ": " + avg);
    }
}

class sTest {
    public static void main(String[] args) {
        Student s0 = new Student(2,"Name","SName",2016,4.5,4.6,4.9);
        Student s1 = new Student(2,"Name","SName",2016);
        Student s2 = new Student();
    }
}
