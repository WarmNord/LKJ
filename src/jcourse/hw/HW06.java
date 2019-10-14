package jcourse.hw;

public class HW06 {
    public static void main(String[] args) {

        int sum = 0;

        int count = 0;

        while (count <= 100) {
            sum += count;
            count++;

        }

        float result = sum / (float) count;
        System.out.println(result);

    }
}

