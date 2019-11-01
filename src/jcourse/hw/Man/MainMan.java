package jcourse.hw.Man;

public class MainMan {
    public static void main(String[] args) {
        String s = "Это Иван, ему 34 года, его рост 166.3. Должность - программист";

        String n = s.substring(4, 8);
        System.out.println(n);

        String ag = s.substring(14, 16);
        int a = Integer.parseInt(ag);
        System.out.println(a);

        String h = s.substring(32, 37);
        double h1 = Double.parseDouble(h);
        System.out.println(h1);

        String p = s.substring(51, 62);
        System.out.println(p);

        Man m = new Man(n, p, a, h1);

        m.getAge();
        m.getName();
        m.getHeight();
        m.getPosition();


    }


}
