package school.lemon.changerequest.java.introduction.hw1;


public class Task10 {

    public static boolean containDigitTwo(int n) {
        while (true) {
            if (n % 10 == 2) {
                return true;
            }
            if (n / 10 == 0) {
                break;
            }
            n = n / 10;
        }

        return false; // Test 10 done.
    }
}
