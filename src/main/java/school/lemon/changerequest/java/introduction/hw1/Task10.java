package school.lemon.changerequest.java.introduction.hw1;


public class Task10{

    public static boolean containDigitTwo(int n) {

        String n2 = Integer.toString(n);
        String c = "2";
        boolean forNumber2 = n2.contains(c);
        return forNumber2;
    }

    public static void main(String[] args) {
        System.out.println(containDigitTwo(-14));
    }

}

