package judm.L17.HW17;

public class Rav {
    static boolean ravenstvo(StringBuilder a, StringBuilder b) {
        boolean res = true;

        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++){

                if (a.charAt(i) != b.charAt(i)){
                    res = false;
                    break;
                }

            }
        } else {
            res = false;
        }

        return res;
    }

    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder("abc");
        StringBuilder s2 = new StringBuilder("abc");


        System.out.println(Rav.ravenstvo(s1, s2));
    }
}


