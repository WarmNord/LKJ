package judm.L19;

public class Test5 {
    public static void main(String[] args) {
        int[][] a = {{3, 7, 8}, {4, 5}, {9, 4, 4, 6, 8, 3}};

/*        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
        }*/

        for (int [] i: a) {
            for (int j: i) {
                System.out.print(j + " ");
            }
        }
    }
}
