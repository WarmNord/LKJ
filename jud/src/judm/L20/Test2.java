package judm.L20;

import javax.jnlp.ClipboardService;
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("Bye");
        l.add("B");
        l.add(1, "y");
        //l.remove("Bye");

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("l2");
        l2.add("l2");
        l.addAll(1,l2);

        for (String s : l) {
            System.out.println(s + " ");
        }

    }
}
