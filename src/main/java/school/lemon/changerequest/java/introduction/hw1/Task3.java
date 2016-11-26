package school.lemon.changerequest.java.introduction.hw1;

public class Task3 {
    public static boolean isBetween(int a, int b, int c) {
       return b<=a && b>=c || b>a && b<c || b>c && b<a;
    }
    public static void main (String[] args){
        System.out.println(Task3.isBetween(1,2,3));
        System.out.println(Task3.isBetween(5,4,-1));
        System.out.println(Task3.isBetween(6,6,6));
        System.out.println(Task3.isBetween(-1,-2,0));
        System.out.println(Task3.isBetween(-28,-26,26));
    }
}
