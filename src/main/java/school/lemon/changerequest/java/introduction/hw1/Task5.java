package school.lemon.changerequest.java.introduction.hw1;


public class Task5 {

    public static double calculateA(double x, double y, double z) {


        double a;
        a = (2 * (Math.sin(x - (Math.PI / 6))) * calculateB(z))  / (0.5 + Math.pow(Math.sin(y), 2));
        return a;
    }

    private static double calculateB(double z) {
        double b;
        b = 1 + Math.pow(z,2) / (3 + Math.pow(z,2) / 5);
        return b;
    }




    public static void main(String[] args) {
        System.out.println(calculateA(1.45,1.22,3.5));
        System.out.println(calculateB(0.001));
    }
}

