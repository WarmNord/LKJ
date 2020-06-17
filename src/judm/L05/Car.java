package judm.L05;

public class Car {
    Car(String c,String e) {
        color = c;
        engine = e;
        System.out.println("color: " + color + " engine: " + engine);
    }

    String color;
    String engine;
    int speed;

    int gaz(int a) {
        speed += a;
        return speed;
    }

    int torm(int b) {
        speed -= b;
        return speed;
    }

    void showInfo() {
        System.out.println("Color: " + color + " Moto: " + engine + " Speed: " + speed);
    }
}

class Car2 {
    public static void main(String[] args) {
       /* Car car = new Car();
        car.color = "white";
        car.engine = "V6";
        car.speed = 60;

        car.showInfo();
        car.gaz(80);
        car.showInfo();
        car.torm(20);
        car.showInfo();*/

        Car c1 = new Car("Black", "V4");
        Car c2 = new Car("White", "V6");
        System.out.println(c1.color);

    }
}
