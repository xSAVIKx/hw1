package school.lemon.changerequest.java.introduction.hw1;

public class Task6 {
    public static double calculateS(double x) {

        double sum = 1 + x;

        for (int i = 2, y = 1; i <= 4; i++, y = 1) {
            for (int j = i; j > 0; j--) {
                y = y * j;
            }
            sum += Math.pow(x, i) / y;
        }

        return sum;

    }

    public static double calculateZ(double x, double y) {
        return Math.sin(Math.pow(x, 3)) + Math.pow((Math.cos(y)), 2);
    }

    public static void main(String[] args) {
        System.out.println(calculateS(-1));
        System.out.println(calculateZ(-1, 2.51));
    }
}
