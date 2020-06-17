package kOOP.jEquals;

public class aMain {
    public static void main(String[] args) {
        Adress adres1 = new Adress("Msk","Green",150);
        Adress adres2 = adres1;


       if (adres1.equals(adres2)) { // == сравниваются только ссылки на объекты
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }

        System.out.println(adres1.hashCode());
        System.out.println(adres2.hashCode());
    }
}
