package school.lemon.changerequest.java.introduction.hw1;

public class Task9 {

    public static boolean isPowerOfThree(int n) {
        if (n==1){return true;}
        if (n==0){return false;}
        while(n%3==0){
            n=n/3;
            if (n==1){return true;}
        }
        return false;

    }
}

