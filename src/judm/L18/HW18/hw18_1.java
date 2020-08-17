package judm.L18.HW18;

public class hw18_1 {

    public static void showArray(String [][] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++){
            System.out.print("{");
            for (int j = 0; j< array[i].length; j++){
                if (j != array[i].length - 1) {
                    System.out.print(array[i][j] + ", ");
                } else {
                    System.out.print(array[i][j]);
                }
            }
            if (i != array.length - 1){
                System.out.print("}, ");
            } else {
                System.out.print("}");
            }
        }
        System.out.print(" }");
    }

    public static void main(String[] args) {
        String array [][] = {{"apple", "red"}, {"java", "kotlin", "python"}, {"car"}};
        showArray(array);
    }
}
