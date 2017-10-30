package school.lemon.changerequest.java.introduction.hw1;


public class Task5 {
    public static double calculateA(double x, double y, double z) {

        double a = (2 * Math.sin(x - Math.PI / 6) * calculateB(z)) / (1.0 / 2 + Math.pow(Math.sin(y), 2.0));
        return a;
    }

    private static double calculateB(double z) {

        double sqrZ = z * z;
        double b = 1 + sqrZ / (3 + sqrZ / 5);
        return b;
    }
}
