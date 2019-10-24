package jcourse.hw;

public class HW08 {

    public static void main(String[] args) {

        String[] m = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                "Июль", "Август","Сентябрь", "Октябпь", "Ноябрь", "Декабрь"};

        String result = "";



        for (int i = 0; i < m.length; i++) {

            result += m[i];

            if (i == m.length - 1){

                result += ".";
            } else {

                result += ", ";
            }

        }
        System.out.println(result);
    }


}
