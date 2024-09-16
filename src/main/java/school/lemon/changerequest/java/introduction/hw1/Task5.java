package school.lemon.changerequest.java.introduction.hw1;


public class Task5 {
    public static double calculateA(double x, double y, double z) {
        double b = 1 + (Math.pow(z,2)/(3 + (Math.pow(z,2)/5)));
        double up = (2*Math.sin(x-(Math.PI)/6)*b);
        double down = 0.5 + Math.sin(y)*Math.sin(y);
        return  up / down;
    }

    private static double calculateB(double z) {
        return  1 + (Math.pow(z,2)/(3 + (Math.pow(z,2)/5)));

    }
}
