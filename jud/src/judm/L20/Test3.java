package judm.L20;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList <StringBuilder> l = new ArrayList();
        StringBuilder sb1 = new StringBuilder("ok");
        StringBuilder sb2 = new StringBuilder("a");
        StringBuilder sb3 = new StringBuilder("c");
        l.add(sb1);
        l.add(sb2);
        l.add(sb3);

        for (int i = 0; i < l.size(); i++) {
            l.get(i).append("!!!");
        }

        for (StringBuilder sb: l) {
            System.out.println(sb + " ");
        }
    }
}
