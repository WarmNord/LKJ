package judm.L08;

//import jcourse.OOP.test.Test;

public class Test1 {
     public final int a;

     Test1(){
        a = 10;
     }

     Test1(boolean b) {
         a = 10;
     }

     public void abc(short s){
         final byte b = 10;
         System.out.println(s += b);
     }


    public static void main(String[] args) {
        Test1 t = new Test1();


        System.out.println(t.a);
    }
}
