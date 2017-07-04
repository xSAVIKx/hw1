package school.lemon.changerequest.java.introduction.hw1;

public class Task5 {
    public static double calculateA(double x, double y, double z) {
        double dividend = 2*Math.sin(x-Math.PI/6)*calculateB(z);
        double divider = 0.5+Math.pow(Math.sin(y),2);
        return dividend/divider;
    }

    private static double calculateB(double z) {
        double zInSecondPower = Math.pow(z,2);
        return 1+zInSecondPower/(3+zInSecondPower/5);
    }
}
