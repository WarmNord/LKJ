package jcourse.classwork;

public class Loop {

   /* int a = 10;
    a = a +1;
    a += 1;
    a++;
    a = a - 1;
    a -= 1;
    a--; */

    public static void main(String[] args) {
       /* int i = 1;

        while (i <= 1000) {
            System.out.println(i);
            i++;

            if (i == 5) {
                break;
            }
        }

        int a =0;
        do {
            System.out.println("hi");
        }
        while (a > 0);
*/

        for (int i = 1000; i > 0; i--) {
            if (i % 3 == 0) {
                System.out.println(i);
            }

        }

    }
}
