package school.lemon.changerequest.java.introduction.hw1;

public class Task6 {
    private static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    } //мастерский метод для нахождения факториала

    public static double calculateS(double x) {

        double sum=0;
        for(int i = 0;i<=4;i++) {
            sum+=Math.pow(x,i)/factorial(i);
        }
        return sum;
    }


    public static double calculateZ(double x, double y) {


        return (Math.sin(Math.pow(x, 3))+Math.pow(Math.cos(y), 2));
    }
}
