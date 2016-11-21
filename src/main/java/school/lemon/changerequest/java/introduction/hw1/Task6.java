package school.lemon.changerequest.java.introduction.hw1;

public class Task6 {

    private static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
           }

    public static double calculateS(double x) {
        double s;
        s = 1 + x;
        s += (Math.pow(x,2))/factorial(2);
        s+= (Math.pow(x,3))/factorial(3);
        s+=(Math.pow(x,4))/factorial(4);

        return s;
    }

    public static double calculateZ(double x, double y) {
        double z = Math.pow(Math.cos(y),2);
        z += Math.sin(Math.pow(x,3));
        return z;
    }
}
