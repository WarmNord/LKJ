package judm.L18.HW18;

public class hw18 {
    public static int[] sorting(int[] array) {
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }

        return array;

    }

    public static void main(String[] args) {

        int[] a = {-3, 34, 5, 6, 90, 100};
        hw18.sorting(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


    }
}
