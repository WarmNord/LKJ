package judm.L08.HW08;

public class stfin {
    static final double PI = 3.14;

    static int mut(int a, int b, int c){
        return a * b * c;
    }

    static void show(double a, double b) {
        System.out.println(a / b);
    }

    void sqr(int r1) {
        System.out.println(PI * r1 * r1);
    }

    static void sqra(int r) {
        System.out.println(2 * PI * r);
    }

    void showInf(int r){
        System.out.println("Radius: " + r);
        sqr(r);
        sqra(r);
    }


}

class testHW {
    public static void main(String[] args) {
        stfin.mut(4,5,7);
        stfin.mut(2,2,2);

        stfin.show(23.0,4.20);
        stfin.show(56.8,36.2);

        stfin circle = new stfin();

        circle.sqr(10);
        stfin.sqra(10);
        circle.showInf(11);

    }
}
