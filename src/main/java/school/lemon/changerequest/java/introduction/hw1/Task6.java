package school.lemon.changerequest.java.introduction.hw1;

public class Task6 {

    public int factorial(int n){
        int result;
        if (n==1) return 1;
        result = factorial(n-1)*n;
        return result;
    }

    public double calculateS(double x) {
        double answ = 1;
        for(int i=1; i<5; i++)
            answ = answ + (Math.pow(x, i) / factorial(i));
        return answ;
    }

    public static double calculateZ(double x, double y) {
        return Math.sin(Math.pow(x,3)) + Math.pow(Math.cos(y),2);
    }
}
