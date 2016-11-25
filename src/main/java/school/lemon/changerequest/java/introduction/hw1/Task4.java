package school.lemon.changerequest.java.introduction.hw1;


public class Task4 {

    public static double getSumOfGreatest(double a, double b, double c) {
        double x1;
        double x2;
        if (a >=b){
            x1 = a;
        } else x1 = b;
        if (b >= c){
            x2 = b;
        } else x2 = c;

        return x1 + x2;
    }
}
