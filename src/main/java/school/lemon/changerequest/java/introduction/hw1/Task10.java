package school.lemon.changerequest.java.introduction.hw1;


public class Task10 {

    public static boolean containDigitTwo(int n) {
        int c=2;
        for (int i = 1; i < c; i++) {
            int find = n % 10;
            if (find == 2) return true;
            if ((n / 10) == 0) break;
            n /= 10;
            c += 1;
        }
        return false;
    }}




