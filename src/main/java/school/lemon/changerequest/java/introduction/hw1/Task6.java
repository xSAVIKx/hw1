package school.lemon.changerequest.java.introduction.hw1;

public class Task6 {
    public static double calculateS(double x)
    {
        int f1=2;
        int f2=2*3;
        int f3=2*3*4;
        return
                1+x+Math.pow(x,2)/(f1)+Math.pow(x,3)/(f2)+Math.pow(x,4)/(f3);
            }

    public static double calculateZ(double x, double y)
    {
        return
                Math.sin(Math.pow(x,3))+Math.pow(Math.cos(y),2); // Test 6 done.
    }
}
