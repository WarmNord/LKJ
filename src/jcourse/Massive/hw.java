package jcourse.Massive;

public class hw {
    public static void main(String[] args) {
        int n[] = new int[900];

        for (int i = 0; i < n.length; i++){
            n[i] = 100 + i;
        }

        int s[] = new int[n.length];

        for (int i = 0, j = n.length - 1; i < n.length; i++, j--){
            s[j] = i;
        }

        for (int i : s){
            System.out.println(i);
        }
    }
}
