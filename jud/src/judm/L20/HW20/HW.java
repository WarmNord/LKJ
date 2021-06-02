package judm.L20.HW20;

import java.util.ArrayList;
import java.util.Collections;

public class HW {

    ArrayList<String> abc(String... a) {
        ArrayList<String> arrayList = new ArrayList<String>();

        for (String f : a) {
            if (!arrayList.contains(f)) {
                arrayList.add(f);
            }
        }
        Collections.sort(arrayList);

        return arrayList;
    }

    public static void main(String[] args) {
        HW h = new HW();
        System.out.println(h.abc("a", "h", "b", "z", "w"));
    }
}
