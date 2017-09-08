package school.lemon.changerequest.java.introduction.hw1;


public class Task5 {
    public static double calculateA(double x, double y, double z) {
        double divider = (0.5 + Math.pow(Math.sin(y), 2));
        double divisible = 2 * (Math.sin(x - Math.PI / 6)) * calculateB(z);
        return divisible/divider;
    }

    private static double calculateB(double z) {
        double pow = Math.pow(z, 2);
        return 1 + pow / (3 + (pow / 5));
    }
}
