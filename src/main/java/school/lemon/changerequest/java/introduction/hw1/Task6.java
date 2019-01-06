package school.lemon.changerequest.java.introduction.hw1;

public class Task6 {
    public static double calculateS(double x) {
        double S = 1;
        for (int i = 1; i <= 4; i++)
            S += Math.pow(x, i) / factorial(i);
        return S;
    }

    private static int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res *= i;
        return res;
    }

    public static double calculateZ(double x, double y) {
        double z = Math.sin(Math.pow(x, 3)) + Math.pow(Math.cos(y), 2);
        return z;
    }
}
