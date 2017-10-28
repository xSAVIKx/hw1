package school.lemon.changerequest.java.introduction.hw1;


public class Task4 {

    public static double getSumOfGreatest(double a, double b, double c) {

        double sum = 0;
        if (a < b && a < c)
            sum = b + c;
        else if (b > c)
            sum = a + b;
        else
            sum = a + c;
        return sum;
    }
}
