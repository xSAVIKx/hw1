package school.lemon.changerequest.java.introduction.hw1;

public class Task6 {

    public static int fact(int n) {
        int result;

        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }


    public static double calculateS(double x) {
        double sum = 0;

        for (int i = 1; i < 5; i++) {


            sum += Math.pow(x, i) / fact(i);
        }

        return sum;

    }


    public static double calculateZ(double x, double y) {

        return (Math.sin(Math.pow(x, 3)) + Math.pow(Math.cos(y), 2));

    }
}
