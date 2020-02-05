package kcourse.OOPEquals;

public class MainAdress {
    public static void main(String[] args) {
        Adress adress1 = new Adress("Moscow","Green",150);
        Adress adress2 = adress1;


       // Adress adress2 = new Adress("Moscow","Green",150);

        if (adress1.equals(adress2)) { // если сравнимваем 2 ссылочные переменные через знак == мы не сравниваем значнеия полей объекта, сравниваем только ссылки
            System.out.println("Equalse");
        } else
        {
            System.out.println("Not equals");
        }
        System.out.println(adress1.hashCode());
        System.out.println(adress2.hashCode());
    }
}
