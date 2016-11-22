package school.lemon.changerequest.java.introduction.hw1;


public class Task4 {

    public static double getSumOfGreatest(double a, double b, double c) {
        if (a<b && b<c) return (b+c);
        if (a>=b && b>=c) return (a+b);
        else
            return (a+c);
    }
    public static void main (String[] args) {
        System.out.println(getSumOfGreatest(1, 2, 3));
        System.out.println(getSumOfGreatest(5, 4, -1));
        System.out.println(getSumOfGreatest(6, 6, 6));
        System.out.println(getSumOfGreatest(-1, -2, 0));
        System.out.println(getSumOfGreatest(-28, -26, 26));
    }
}
