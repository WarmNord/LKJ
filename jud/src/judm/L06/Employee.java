package judm.L06;

public class Employee {
    private Employee(int id2, String surname2, int age2) {
        this(id2,surname2,age2,0,null);

    }
    Employee(String surname3, int age3) {
        this(0,surname3,age3,0,null);

    }
    public Employee(int iD, String sName, int ag, int sa, String dep) {
        id = iD;
        surname = sName;
        age = ag;
        salary = sa;
        department = dep;
    }


    protected int id;
    public String surname;
    int age;
    private int salary;
    String department;

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public int getSalary() {
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
       // Employee e1 = new Employee(1,"Ivanov",25);
        Employee e2 = new Employee(1,"n1",20,100,"Test");
        Employee e3 = new Employee(4, "1",20,100,"g");

    }
}