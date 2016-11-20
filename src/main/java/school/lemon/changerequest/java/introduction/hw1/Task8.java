package school.lemon.changerequest.java.introduction.hw1;

public class Task8 {
    public static int calculateSum(int N) {
        int Sum = 0;

        for (int n = 0; n <= N; n++)
        {

            Sum += Math.pow((n+N),2);
        }

        return Sum;
    }
}
