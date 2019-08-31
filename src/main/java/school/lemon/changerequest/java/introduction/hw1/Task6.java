package school.lemon.changerequest.java.introduction.hw1;

public class Task6 {
    public static double calculateS(double x) {
        return (1 + x + (Math.pow(x, 2)/factorial(2)) + (Math.pow(x, 3)/factorial(3)) + (Math.pow(x, 4)/factorial(4)));

        }

    private static int factorial(int n) {
        int result = 1;
        for (int i = n; i > 0; i--) {
            result = result * i;
            }
            return result;
    }

    public static double calculateZ(double x, double y) {

        return Math.sin(Math.pow(x, 3)) + Math.pow(Math.cos(y), 2);
    }
}
