package school.lemon.changerequest.java.introduction.hw1;

public class Task9 {

    public static boolean isPowerOfThree(int n) {
        boolean flag = true;
        if(n == 0)
            flag = false;
        while(n > 1){
            if((n % 3) > 0){
                flag = false;
                break;
            } else n = n/3;
        }

        return flag;
    }
}
