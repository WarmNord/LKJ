package judm.L20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        ArrayList<StringBuilder> l1 = new ArrayList<>();
        l1.add(sb1);
        l1.add(sb2);
        l1.add(sb3);

        //ArrayList <StringBuilder> l2 = (ArrayList<StringBuilder>) l1.clone();
        //System.out.println(l1 == l2);
        StringBuilder[] a2 = l1.toArray(new StringBuilder[10]);
        StringBuilder[] a3 = {sb1, sb2, sb3};
        List<StringBuilder> lSB = Arrays.asList(a3);
        a3[0] = new StringBuilder("!!!");

        System.out.println(lSB);


    }
}
