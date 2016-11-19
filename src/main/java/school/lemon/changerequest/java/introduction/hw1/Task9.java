package school.lemon.changerequest.java.introduction.hw1;

public class Task9 {

    public static boolean isPowerOfThree(int n)
    {
        double Rezult=Math.log(n)*(int)(Math.log(3))/((int)(Math.log(n))*(Math.log(3)));
        if (Rezult==1)
        {return true;}
        return false; // Test 9 done.
    }
}
