package school.lemon.changerequest.java.introduction.hw1;

public class Task3 {
    public static boolean isBetween(int a, int b, int c) {
        return
                a <= c && b >= a && b <= c || c < a && b <= a && b >= c;// Test 3 done.
    }
}
