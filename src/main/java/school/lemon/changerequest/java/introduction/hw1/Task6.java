package school.lemon.changerequest.java.introduction.hw1;

public class Task6 {
    public static double calculateS(double x) {

        double sum = 1;
        for (double i = 4; i > 0; --i) {
            sum = 1 + x * sum / i;
        }
        return sum;
    }

    public static double calculateZ(double x, double y) {
        return Math.sin(Math.pow(x, 3)) + Math.pow(Math.cos(y), 2);
    }
}
