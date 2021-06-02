package judm.L22;

public class People {
    final String gender;

    People(String gender) {
        this.gender = gender;
    }

    private String name;
    private int olds;
    private int weight;


    public StringBuilder getName() {
        StringBuilder copyName = new StringBuilder(name);
        return copyName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StringBuilder getOlds() {
        StringBuilder copyOlds = new StringBuilder(olds);
        return copyOlds;
    }

    public void setOlds(int olds) {
        if (olds > 0) {
            this.olds = olds;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }


}

class testPeople {
    public static void main(String[] args) {
        People p1 = new People("male");
        p1.setName("Ivi");
        p1.setOlds(25);
        p1.setWeight(65);
        p1.setWeight(-2);

        System.out.println(p1.getName());
        System.out.println(p1.getOlds());
        System.out.println(p1.getWeight());

    }
}
