package school.lemon.changerequest.java.introduction.hw1;

public class Task6 {
    public static double calculateS(double x) {
        return (1 + (x * (((Math.pow(x, 2) *x) *x) / (factorial(2)*factorial(3)*factorial(4)))));

        }

    private static int factorial(int n) {
        for (int i = 1; i <= n; i++) {
            n = n * i;
            }
            return n;
    }

    public static double calculateZ(double x, double y) {

        return Math.sin(Math.pow(x, 3)) + Math.pow(Math.cos(y), 2);
    }
}
