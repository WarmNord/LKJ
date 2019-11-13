package jav;

public class weat {

    public static void main(String[] args) {

        String nameOfMonth = "March";
        String season;

        switch (nameOfMonth) {
            case "March":
                season = "spring";
                System.out.println(season);
                break;
            default:
                System.out.println("nothing");
        }
    }
}
