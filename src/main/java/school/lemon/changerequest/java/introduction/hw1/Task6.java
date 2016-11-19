package school.lemon.changerequest.java.introduction.hw1;

public class Task6 {
    private static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    } //мастерский метод для нахождения факториала

    public static double calculateS(double x) {

        return (1+x+ Math.pow(x, 2)/factorial(2)+Math.pow(x, 3)/factorial(3)+Math.pow(x, 4)/factorial(4));
    }

    public static double calculateZ(double x, double y) {


        return (Math.sin(Math.pow(x, 3))+Math.pow(Math.cos(y), 2));
    }
}
