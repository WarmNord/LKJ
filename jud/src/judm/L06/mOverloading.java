package judm.L06;

public class mOverloading {
    void show(int i){
        System.out.println(i);
    }

    void show(boolean b) {
        System.out.println(b);
    }

    void show(String s) {
        System.out.println(s);
    }
    void show(String s, int a) {
        System.out.println(s +" "+ a);
    }
    void show(int a, String s) {
        System.out.println( a +" "+ s);
    }
}

class mOverloadingTest {
    public static void main(String[] args) {
        mOverloading mO = new mOverloading();
        mO.show(100);
        mO.show(true);
        mO.show("s");

    }
}