package school.lemon.changerequest.java.introduction.hw1;


public class Task4 {

    public static double getSumOfGreatest(double a, double b, double c) {
        double min = c;
        if (Math.min(a, b) < c) {
            min = Math.min(a, b);
        }
        return a + b + c - min;
    }
}
