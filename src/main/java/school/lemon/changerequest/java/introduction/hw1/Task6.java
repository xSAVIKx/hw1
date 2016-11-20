package school.lemon.changerequest.java.introduction.hw1;

public class Task6 {

   public static int fact(int n) {
        int result;

        if(n==1) return 1;
        result = fact(n-1) * n;
        return result;
    }


    public static double calculateS(double x) {

        return  1 + x + Math.pow(x,2) / fact(2) + Math.pow(x,3) / fact(3) + Math.pow(x,4) / fact(4) ;
    }


    public static double calculateZ(double x, double y) {

        return (Math.sin(Math.pow(x, 3))+Math.pow(Math.cos(y), 2));

    }
}
