package jcourse.OOP.box;

public class Box {

    public double width;
    public double height;
    public double length;


    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;

    }

    public void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;

    }

    public void showInfo() {
        System.out.println(width + " " + height + " " + length);
    }

    public Box(double size) {
        width = size;
        height = size;
        length = size;
    }

    public Box() {
        width = 0;
        height = 0;
        length = 0;
    }

    public Box(Box box) {
        this.width = box.width;
        this.length = box.length;
        this.height = box.height;
    }

    Box(Box box1, Box box2) {
        this.width = box1.width + box2.width;
        this.length = box1.length + box2.length;
        this.height = box1.height + box2.height;
    }

    Box sumBox(Box box) {
        return new Box(this.width + box.width, this.height + box.height, this.length + box.length);
    }

    Box increase(int i) {
        return new Box(width * i, height * i, length * i);
    }


    public double volume() {
        return width * height * length;
    }

    double Volume() {
        return width * length * height;

    }

    @Override
    public String toString() {
        String result = String.format("W %s\nL %s\nh %s", width, length, height);
        return result;
    }
}




