package school.lemon.changerequest.java.introduction.hw1;

public class Task4 {

    public static double getSumOfGreatest(double a, double b, double c) {
        double[] array = {a, b, c};
        double minElement = min(array);
        double sumOfAllElements = a + b + c;
        return sumOfAllElements - minElement;
    }

    private static double min(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
