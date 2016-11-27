package school.lemon.changerequest.java.introduction.hw1;

public class Task8 {
    public static int calculateSum(int N) {
        int result = 0;
        int i;
        for (i = N; 2 * N >= i; i++)
            result = (int) (i + Math.pow((2 * N), 2));
        return result;
    }
}
