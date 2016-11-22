package school.lemon.changerequest.java.introduction.hw1;

public class Task3 {
    public static boolean isBetween(int a, int b, int c) {
        if (b >= a && b <= c || b <= a && b >= c) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isBetween(5, 4, -1));
    }


}
