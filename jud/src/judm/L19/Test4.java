package judm.L19;

public class Test4 {
    public static void main(String[] args) {
        String [] students = {"I","A","B"};
        String [] subjects = {"Math","Phil"};

        for (String s1: students) {
            for (String s2: subjects) {
                System.out.println(s1 + " " + s2);
            }
        }
    }
}
