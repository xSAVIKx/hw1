package school.lemon.changerequest.java.introduction.hw1;


public class Task4 {

    public static double getSumOfGreatest(double a, double b, double c) {
        return a + b + c - Math.min(Math.min(a, b), c);
    }
}
