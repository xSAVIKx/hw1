package school.lemon.changerequest.java.introduction.hw1;

public class Task8 {
    public static int calculateSum(int N)
    {
        int Sum=0;
        for(int i=0;(N+i)<=2*N;i++)
        {
            Sum+=(N+i)*(N+i);
        }

        return Sum; // Test 8 done.
    }
}
