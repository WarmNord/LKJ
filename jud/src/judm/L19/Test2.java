package judm.L19;

public class Test2 {

    static void sum(int ... a){
        int s = 0;
        for (int i = 0; i<a.length;i++){
            s += a[i];
        }

        System.out.println(s);
    }

    public static void main(String[] args) {
        sum(1,2,3,4,5);
    }
}
