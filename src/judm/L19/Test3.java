package judm.L19;

public class Test3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 6, 5};
        int s = 0;


        for (int i : a) {
            s+=i;
        }
        System.out.println(s);
    }
}
