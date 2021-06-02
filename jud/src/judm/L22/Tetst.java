package judm.L22;

public class Tetst {
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
