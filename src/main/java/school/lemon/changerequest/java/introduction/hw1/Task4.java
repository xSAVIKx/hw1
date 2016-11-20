package school.lemon.changerequest.java.introduction.hw1;


public class Task4 {

    public static double getSumOfGreatest(double a, double b, double c) {
        double sum;
        if (a < b && a < c){
             sum = b + c;
        }
        else if (b < a && b < c){
            sum = a + c;

        }
        else sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getSumOfGreatest(5, 4, -1));
    }
}
