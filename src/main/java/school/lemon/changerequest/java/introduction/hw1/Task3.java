package school.lemon.changerequest.java.introduction.hw1;

public class Task3 {
    public static boolean isBetween(int a, int b, int c) {
        return a <= b && c >= b || c <= b && b >= a || a > b && c < b;
    }
}
