package school.lemon.changerequest.java.introduction.hw1;

public class Task6 {
    public static double calculateS(double x) {
        return (1+x+Math.pow(x,2)/2+Math.pow(x,3)/6+Math.pow(x,4)/24);
    }

    public static double calculateZ(double x, double y) {
        return Math.sin(Math.pow(x,3))+Math.pow(Math.cos(y),2);
    }
}
