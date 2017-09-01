package school.lemon.changerequest.java.introduction.hw1;

public class Task8 {
    public static int calculateSum(int N) {
        int power = 2;
        int base;

        int sum = (int) Math.pow(N, power);

        for (int i = 1; i < N; i++) {
            base = N + i;
            sum += (int) Math.pow(base, power);
        }
        return sum + (int) Math.pow((2 * N), power);
    }
}
