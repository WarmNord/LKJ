package jcourse.OOP;

public class Main {

    public static void main(String[] args) {

        Box box = new Box(10);
        Box box2 = new Box(15, 20, 25);
        Box box3 = new Box();

        int result = box.compare(box2);

        switch (result) {

            case -1:
                System.out.println("Our box is smaller");
                break;
            case 0:
                System.out.println("Boxex are equal");

            case 1:
                System.out.println("Our box is more");

        }
    }
}
