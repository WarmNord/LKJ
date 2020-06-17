package judm.L09;

public class Car {
    String color;
    String engine;
    static int count;

    Car(String color2, String engine2) {
        count++;
        this.color = color2;
        this.engine = engine2;
    }

    public void showColor(){
        System.out.println("Color car: " + color);
        this.changeColor("Red");
    }

    public void changeColor(String color3){
        System.out.println("Car color changed" );
        int price = 5000;
        color = color3;
        price += 1000;
    }
}
