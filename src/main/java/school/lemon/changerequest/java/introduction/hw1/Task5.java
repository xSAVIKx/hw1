package school.lemon.changerequest.java.introduction.hw1;


public class Task5 {
    public static double calculateA(double x, double y, double z)
    {
        return
                2*(Math.sin(x-(Math.PI)/6))*calculateB(z)/(0.5+(Math.sin(y))*(Math.sin(y)));
    }

    private static double calculateB(double z)
    {
        return 1+z*z/(3+(z*z)/5); // Test 5 done.
    }
}
