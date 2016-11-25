package school.lemon.changerequest.java.introduction.hw1;

public class Task8 {
    public static double calculateSum(double N) {
        double res = 0;
        int i;
        for(i=0; i <(N+1); i++)
            res = res + Math.pow((N + i), 2);

        return res;
    }
}
