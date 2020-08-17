package judm.L18;

public class Test6 {

    public static void maxMin(double[] a) {
        double max = a[0];
        double min = a[0];

        for (int i = 0; i < a.length; i++){
            if (a[i] > max) {
                max = a[i];
            }

            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Min: " + min + " Max: " + max);


    }


    public static void main(String[] args) {
        double [] a1 = {1.05, -3.14, 10, 3, 8};
        maxMin(a1);


    }
}
