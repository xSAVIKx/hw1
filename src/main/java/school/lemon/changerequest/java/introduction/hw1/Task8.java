package school.lemon.changerequest.java.introduction.hw1;

public class Task8 {
    public static double calculateSum(int N) {
        double sum = 0;
        for(int i=0; i<=N; i++){
            double result = sum;
            sum = result + (Math.pow((N + i), 2));
        }
        return sum;
    }
}
