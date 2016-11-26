package school.lemon.changerequest.java.introduction.hw1;

public class Task3 {
    public static boolean isBetween(int a, int b, int c) {

        if ((a <= b && b <= c) || (a >= b && b >= c)) {
            return true;
        } else {
            return false;
        }
    }
}
