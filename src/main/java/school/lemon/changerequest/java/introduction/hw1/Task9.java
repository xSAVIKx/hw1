package school.lemon.changerequest.java.introduction.hw1;

public class Task9 {
    public static boolean isPowerOfThree(int n) {
        if (n == 0)
            return false;

        //n = 1 - true, иначе не выполняется условеи
        return n == 1 || n > 1 && n % 3 == 0 && isPowerOfThree(n / 3); //упростила idea

    }


    }