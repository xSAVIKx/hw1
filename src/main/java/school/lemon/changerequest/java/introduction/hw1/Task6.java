package school.lemon.changerequest.java.introduction.hw1;

public class Task6 {
    public static double calculateS(double x) {
        double s;
        s = 1 + x;
        s += (Math.pow(x,2))/2;
        s+= (Math.pow(x,3))/6;
        s+=(Math.pow(x,4))/24;

        return s;
    }

    public static double calculateZ(double x, double y) {
        double z = Math.pow(Math.cos(y),2);
        z += Math.sin(Math.pow(x,3));
        return z;
    }
}
