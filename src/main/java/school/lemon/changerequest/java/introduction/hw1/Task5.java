package school.lemon.changerequest.java.introduction.hw1;


import static java.lang.Math.*;

public class Task5 {
    public static double calculateA(double x, double y, double z) {
        return 2*(Math.sin(x-(Math.PI)/6))*calculateB(z)/(0.5+(Math.sin(y))*(Math.sin(y)));
    }

    private static double calculateB(double z) {
        return 1+z*z/(3+(z*z)/5);
    }
    public static void main (String args[]){
        System.out.println(Task5.calculateA(1.45, 1.22, 3.5)); // works, done
    }

}