package school.lemon.changerequest.java.introduction.hw1;

import java.math.BigInteger;

public class Task6 {
    public static double calculateS(double x) {

        double s=1+x+(Math.pow(x,2)/(2*1))+(Math.pow(x,3)/(3*2*1))+(Math.pow(x,4)/(4*3*2*1));
        return s;
    }

    public static double calculateZ(double x, double y) {
        double z=Math.sin(Math.pow(x,3))+Math.pow(Math.cos(y),2);
        return z;
    }
}
