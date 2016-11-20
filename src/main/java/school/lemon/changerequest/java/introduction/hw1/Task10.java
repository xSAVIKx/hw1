package school.lemon.changerequest.java.introduction.hw1;


public class Task10 {

    public static boolean containDigitTwo(int n) {
        while(n >= 2)
        {
            n /=10;
            if(n % 10 == 2)
                return true;
        }
        return false;
    }
}
