package jcourse.collections.main;

public class mainCollections {

    public static void main(String[] args) {

       MyArrayList employees = new MyArrayList();
       employees.add("Nikita");
        employees.add("Igor");
        employees.add("Ivan");
        employees.add("Iv");
        employees.add("Max");
        employees.add("Ig");
        employees.add("If");

        employees.remove("Ivan");

        for (int i = 0; i < employees.getSize(); i++){
            System.out.println(employees.get(i));
        }



    }



}
