package school.lemon.changerequest.java.introduction.hw1;

public class Task9 {

    public static boolean isPowerOfThree(int n) {
        return verifyIsPowerOfThree(n);
    }

    private static boolean verifyIsPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 3 == 0 && n > 0) {
            return verifyIsPowerOfThree(n / 3);
        } else {
            return false;
        }
    }
}

