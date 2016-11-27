package school.lemon.changerequest.java.introduction.hw1;


public class Task5 {
    public static double calculateA(double x, double y, double z) {

        double a;
        a = (2*(Math.sin(x-(Math.PI)/6))*calculateB(z))/(1/2 + (Math.pow(Math.sin(y), 2)));
        return a;
    }

    private static double calculateB(double z) {

        double b;
        b = 1 + (Math.pow(z, 2)/(3+(Math.pow(z, 2))/5));
        return b;
    }
    public static void main(String[] args) {
        System.out.println(calculateA(-1, 2.51, -8.12)); //почему-то результат не сходится, но запись вроде верная
    }
}