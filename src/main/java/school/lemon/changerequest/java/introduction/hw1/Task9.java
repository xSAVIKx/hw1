package school.lemon.changerequest.java.introduction.hw1;

public class Task9 {

    public static boolean isPowerOfThree(int n) {
        return verifyIsPowerOfThree(n);
    }

    private static boolean verifyIsPowerOfThree(int n) {
        boolean result;
        if(n != 0 ){
            if (n % 3 == 0) {
                return verifyIsPowerOfThree(n / 3);
            }
            else{
                if (n == 1) {
                    result = true;
                }
                else{
                    result = false;
                }
            }
        }
        else{
            result = false;
        }
        return result;
    }
}

