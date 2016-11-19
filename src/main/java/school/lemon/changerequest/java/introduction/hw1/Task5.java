package school.lemon.changerequest.java.introduction.hw1;


import static java.lang.Math.*;

public class Task5 {
    public static double calculateA(double x, double y, double z) {
        return ((2 * sin(x - (PI / 6)) * calculateB(z)) / ((1 / 2) + pow(sin(y), 2)));
    }

    private static double calculateB(double z) {
        return (1+((pow(z, 2))/(3+((pow(z, 2)/5)))));
    }
    public static void main (String args[]){
        System.out.println(Task5.calculateA(1.45, 1.22, 3.5)); // корче считает не правильно, а все записано вроде правильно
    }

}