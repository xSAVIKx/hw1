package school.lemon.changerequest.java.introduction.hw1;


public class Task10 {
    public static boolean containDigitTwo(int n) {
        if(n<1){
            return false;
        }
        if(n % 10 == 2){
            return true;
        }
        else{
         return containDigitTwo(n/10);
        }
    }
}
