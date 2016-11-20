package school.lemon.changerequest.java.introduction.hw1;


public class Task10 {

    public static boolean containDigitTwo(int n) {
        int j = 2;
        for (int i = 1; i < j; i++) {
            int raz = n % 10;
            if (raz == 2) {
                return true;
            }
            if ( n / 10 == 0) {
                break;
            }
            n = n / 10;
            j++;
        }
        return false; // Test 10 done.
    }
}
