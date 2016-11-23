package school.lemon.changerequest.java.introduction.hw1;

public class Task8 {
    public static int calculateSum(int N) {
        int count = 0;
        for (int i = N; i <= 2 * N; i++) {
            count += i * i;

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(calculateSum(4));
    }
}
