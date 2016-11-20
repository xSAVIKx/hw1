package school.lemon.changerequest.java.introduction.hw1;


public class Task4 {

    public static double getSumOfGreatest(double a, double b, double c) {
        if (a > b && b > c) {
            return a + b;//summ 1
        }
        if (a > b && b < c) {
            return a + c;//summ 2
        }
        return b + c;//default
    }
}
