package school.lemon.changerequest.java.introduction.hw1;

public class Task8 {
    public static int calculateSum(int N) {
        int result = 0;
        for (int i = 0; i <= N; i++)
            result += Math.pow(N + i, 2);
        return result;
    }
}
