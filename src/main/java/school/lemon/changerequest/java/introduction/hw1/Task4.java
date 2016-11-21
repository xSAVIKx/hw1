package school.lemon.changerequest.java.introduction.hw1;


public class Task4 {

    public static double getSumOfGreatest(double a, double b, double c) {
        if(a > b && b > c)
            return  a + b;
        else
            if(b > a && a > c)
                return b + a;
        else
            return b+c;

    }
}
