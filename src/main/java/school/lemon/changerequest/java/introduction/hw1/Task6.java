package school.lemon.changerequest.java.introduction.hw1;

public class Task6  {

    private static int fact(int n) {
        if(n == 0 ) return 1;
        return fact(n - 1 ) * n;
    }

    public static double calculateS(double x) {
        double s = 0;
        for (int i = 0; i <= 4; i++) {
        s+=Math.pow(x,i) / fact(i);
        }
        return s;
    }

    public static double calculateZ(double x, double y) {
        double z;
        return Math.sin(Math.pow(x, 3)) + Math.pow((Math.cos(y)), 2);
    }

}
