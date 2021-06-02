package judm.L05.HW05;

public class Employee {
    Employee(int iD, String sName, int ag, int sa, String dep) {
        id = iD;
        surname = sName;
        age = ag;
        salary = sa;
        department = dep;
    }

    int id;
    String surname;
    int age;
    int salary;
    String department;

    double upSalary() {
        salary *= 2;
        return salary;
    }
}

class emloyeeTest {

    public static void main(String[] args) {
        Employee e1 = new Employee(1,"n1",20,100,"Test");
        Employee e2 = new Employee(2,"n2",25,500,"SE");

        e1.upSalary();
        e2.upSalary();

        System.out.println(e1.salary);
        System.out.println(e2.salary);
    }


}