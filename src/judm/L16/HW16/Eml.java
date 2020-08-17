package judm.L16.HW16;

public class Eml {
    void email(String em) {
        int a = 0;
        int b = 0;
        int c = 0;

        while (c < em.length() - 1) {

            a = em.indexOf('@',c);
            b = em.indexOf('.',c);
            c = em.indexOf(':',c);
            System.out.println(em.substring(a + 1, b));
        }

    }
}
