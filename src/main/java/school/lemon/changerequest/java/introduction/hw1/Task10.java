package school.lemon.changerequest.java.introduction.hw1;


public class Task10 {

    public static boolean containDigitTwo(int a) {
        boolean flag = false;
        int aLast;
        if(a == 0)
            flag = false;
        while((a/10) > 0){
            aLast = a%10;
            a = a/10;
            if((aLast == 2)|(a == 2)) {
                flag = true;
                break;
            }
        }
        return flag;
        }
}
