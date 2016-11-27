package school.lemon.changerequest.java.introduction.hw1;


public class Task10 {

    public static boolean containDigitTwo(int n) {

        while (n > 0) {
            if (n % 10 == 2)
            if (n / 10 == 10) {
                return true;
            }
        }
        return false;
    }
}
