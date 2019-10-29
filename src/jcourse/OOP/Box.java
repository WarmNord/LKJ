package jcourse.OOP;

public class Box {

    double width;
    double height;
    double length;

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

    Box(double size) {

        width = size;
        height = size;
        length = size;

    }

    Box() {
        width = 0;
        height = 0;
        length = 0;
    }

    public double volume() {
        return width * height * length;

    }

    void showVolume() {

        System.out.println(volume());
    }

    int compare(Box box) {

        double thisVolume = volume();
        double boxVolume = box.volume();
        int result;

        if (thisVolume > boxVolume) {
            result = 1;
        }
        else if (thisVolume < boxVolume) {
            result = -1;
        }
        else {
            result = 0;
        }
        return result;
    }
}



