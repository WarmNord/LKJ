package judm.L11.HW11;


public class Car {

    String color;
    String engine;
    int countDoors;

    public Car(String color, String engine, int countDoors) {
        this.color = color;
        this.engine = engine;
        this.countDoors = countDoors;
    }
}

class CarTest {
    void changeDoors(Car a, int b) {
        a.countDoors = b;
    }

    void changeColor(Car a, Car b) {
        String c = a.color;
        a.color = b.color;
        b.color = c;
    }



    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car c1 = new Car("blue","v2", 4);
        Car c2 = new Car("green","v6", 6);

        System.out.println(c1.countDoors);
        ct.changeDoors(c1,2);
        System.out.println(c1.countDoors);

        System.out.println(c1.color + " " + c2.color);
        ct.changeColor(c1,c2);
        System.out.println(c1.color + " " + c2.color);
    }


}
