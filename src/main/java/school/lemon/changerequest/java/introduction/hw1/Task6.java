package school.lemon.changerequest.java.introduction.hw1;

public class Task6 {

    private static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
           }

    public static double calculateS(double x) {
        double s=0;
        for(int i = 0;i<=4;i++) {
            s+=Math.pow(x,i)/factorial(i);
        }
        return s;
    }

    public static double calculateZ(double x, double y) {
        double z = Math.pow(Math.cos(y),2);
        z += Math.sin(Math.pow(x,3));
        return z;
    }
}
