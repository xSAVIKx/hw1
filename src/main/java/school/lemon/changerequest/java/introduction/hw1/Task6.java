package school.lemon.changerequest.java.introduction.hw1;

public class Task6 {
    public static double calculateS(double x) {
        double s;
        s = 1 + x + ((Math.pow(x,2))/2) + (Math.pow(x,3)/(2*3)) + (Math.pow(x,4)/(2*3*4));
        return s;
    }

    public static double calculateZ(double x, double y) {
        double z;
        z = Math.sin(Math.pow(x,3)) + (Math.pow(Math.cos(y), 2));
        return z;
    }
    public static void main(String[] args) {
        System.out.println(calculateS(1.45));
        System.out.println(calculateZ(1.45, 1.22));
    }
}
