package school.lemon.changerequest.java.introduction.hw1;


public class Task5 {
    public static double calculateA(double x, double y, double z) {
        double a;
        a = (2 * Math.sin(x-(Math.PI)/6)*calculateB(z));
        a = a / (0.5 +Math.pow(Math.sin(y),2));
        return a;
    }

    private static double calculateB(double z) {
       return 1 +((z*z)/(3+(z*z)/5));
    }


}
