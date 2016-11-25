package school.lemon.changerequest.java.introduction.hw1;

public class Task3 {
    public static boolean isBetween(int a, int b, int c) {
        if (((b >= a)&(b <= c))|((b >= c)&(b <= a)))
            return true;
        else  return false;

    }
}
