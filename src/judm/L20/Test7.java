package judm.L20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test7 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";

        ArrayList<String> l1 = new ArrayList<>();
        l1.add(s3);
        l1.add(s1);
        l1.add(s4);
        l1.add(s2);

        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);


    }
}
