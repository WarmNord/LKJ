package jcourse.classwork;

public class L10 {
    public static void main(String[] args) {
        int [] nums = new int[100];

        for (int i = 0; i < nums.length; i++){
            nums[i] = i * 10;
        }

       for (int i : nums) {
           System.out.println(i);
       }
    }
}