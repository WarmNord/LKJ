package judm.L14;

public class Test6 {

    public static void time() {
       outer: for (int hour = 0; hour <= 23; hour++) {

       inner: for (int minutes = 0; minutes <= 59; minutes++) {
                System.out.println(hour +":"+ minutes);
            }
        }

    }
    public static void main(String[] args) {
    Test6.time();
    }
}
