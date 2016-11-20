package school.lemon.changerequest.java.introduction.hw1;

public class Task6 {
    public static double calculateS(double x) {
        double s;
        s = 1 + x + Math.pow(x, 2) / factorial(2) + Math.pow(x, 3) / factorial(3) + Math.pow(x, 4) / factorial(4);
        return s;
}

    public static int factorial(int a) {
        int b = 1;
        for (int i = a; i > 0; i--) {
            b = b * i;
        }
        return b;
    }



    public static double calculateZ(double x, double y) {
        double z = Math.sin(Math.pow(x,3)) + Math.pow((Math.cos(y)), 2);
        return z;
    }

    public static void main(String[] args) {
        System.out.println(calculateS(1.23));
        System.out.println(calculateZ(-1, 2.51));
    }
}
