package judm.L05;

public class L05 {

    int sum(int a, int b, int c ) {
        int result = a + b + c;
        return result;
    }

    int avg(int a, int b, int c) {
        int result = sum(a, b, c) / 3;
        return result;
    }
}

class test {
    public static void main(String[] args) {
        L05 test = new L05();
        int s = test.sum(2,4,5);
        System.out.println(s);
    }
}
