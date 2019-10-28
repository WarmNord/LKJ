package jcourse.hw.Human;

public class Main {
    public static void main(String[] args) {
        human h1 = new human();
        h1.age = 12;
        h1.name = "sss";
        h1.wight = 40;

        human h2 = new human();
        h2.age = 26;
        h2.name = "ralf";
        h2.wight = 45;

        human h3 = new human();
        h3.wight = 55;
        h3.name = "buf";
        h3.age = 32;

        human h4 = new human();
        h4.age = 39;
        h4.name = "hh";
        h4.wight = 68;

        human h5 = new human();
        h5.wight = 78;
        h5.name = "gg";
        h5.age = 48;

        int ageAll = (h1.age + h2.age +h3.age + h4.age + h5.age) / 5;


        System.out.println(ageAll);



    }
}
