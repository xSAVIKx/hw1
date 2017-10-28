package school.lemon.changerequest.java.introduction.hw1;

public class Task9 {

    public static boolean isPowerOfThree(int n) {

        double log3 = Math.log(n) / Math.log(3);
        if(log3 % 1 == 0)
            return true;
        return false;
    }
}
