package judm.L19;

public class Test6 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("H");
        StringBuilder sb2 = new StringBuilder("B");

        String[] b = {"j", "g", "H"};

        int[] a = {0, 6, 4, 1};

        for (int i = 0; i < a.length; i++) {
            a[i] = 3;
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}
