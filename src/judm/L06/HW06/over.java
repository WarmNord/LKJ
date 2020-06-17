package judm.L06.HW06;

public class over {

    void sum() {
        System.out.println(0);
    }

    void sum(int a) {
        System.out.println(a);
    }

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void sum(int a, int b, int c, int x) {
        System.out.println(a + b + c + x);
    }

}

class testOver {
    public static void main(String[] args) {
        over o = new over();
        o.sum();
        o.sum(1);
        o.sum(1,2);
        o.sum(1,2,3);
        o.sum(1,2,3,4);
    }
}
