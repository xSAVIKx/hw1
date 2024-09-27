package school.lemon.changerequest.java.introduction.hw1;

public class Task8 {
    public static int calculateSum(int N) {
        double b = 0;
        double sum=0;
        for (int i = 0; i <= N; i++) {

            b = Math.pow(N + i, 2);
            sum = sum+b;


        }
        return (int) (sum);
    }
}