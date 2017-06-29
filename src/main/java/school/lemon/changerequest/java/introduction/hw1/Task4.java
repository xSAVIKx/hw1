package school.lemon.changerequest.java.introduction.hw1;


public class Task4 {

    public static double getSumOfGreatest(double a, double b, double c) {
        Double[] array = {a,b,c};
        array = sortArray(array);
        return array[array.length-1]+array[array.length-2];
    }

    private static Double[] sortArray(Double[] array) {
        for(int i=array.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(array[j]>array[j+1]){
                    double result = array[j];
                    array[j] = array[j+1];
                    array[j+1] = result;
                }
            }
        }
        return array;
    }
}
