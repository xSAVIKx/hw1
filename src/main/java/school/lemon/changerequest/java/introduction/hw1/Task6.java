package school.lemon.changerequest.java.introduction.hw1;

public class Task6  {

    public static double calculateS(double x) {
        double s;
        s = 1 + x + Math.pow(x, 2) / fact(2) + Math.pow(x, 3) / fact(3) + Math.pow(x, 4) / fact(4);
        return s;
    }

    public static int fact(int n) {
        int result;
        if(n == 1 ) return 1;
        result = fact(n - 1 ) * n;
        return result;}

    public static double calculateZ(double x, double y) {
        double z;
        z = Math.sin(Math.pow(x, 3)) + Math.pow((Math.cos(y)), 2);
        return z;}


    public static void main(String[] args) {
        System.out.println(calculateZ(1.45, 1.22));
        System.out.println(calculateS(4));
        System.out.println(fact(4));
    }
}
