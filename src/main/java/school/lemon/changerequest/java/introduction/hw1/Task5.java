package school.lemon.changerequest.java.introduction.hw1;


public class Task5 {
    public static double calculateA(double x, double y, double z) {
        double a = 1 / 2d;
        double b = 2 * Math.sin(x - (Math.PI) / 6) * calculateB(z);
        double c = a + Math.pow((Math.sin(y)), 2);
        return b / c;
    }

    private static double calculateB(double z) {

        return 1.0 + Math.pow(z, 2) / (3.0 + Math.pow(z, 2) / 5);
    }

    public static void main(String[] args) {
        System.out.println(calculateA(1.23, 2.25, 5.6));
    }
}
