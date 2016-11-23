package school.lemon.changerequest.java.introduction.hw1;

public class Task3 {
    public static boolean isBetween(int a, int b, int c) {

        return b >= a && b <= c || b <= a && b >= c;
    }

    public static void main(String[] args) {
        System.out.println(isBetween(-1, -2, 0));
    }


}
