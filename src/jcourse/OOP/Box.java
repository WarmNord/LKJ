package jcourse.OOP;

public class Box {

    double width;
    double height;
    double length;

    public void setDimens(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;

    }

    public double volume() {
        return width * height * length;

    }
}
