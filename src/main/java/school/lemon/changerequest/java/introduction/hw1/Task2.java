package school.lemon.changerequest.java.introduction.hw1;


public class Task2 {
    public static int getMeters(int centimeters) {

        return (centimeters/100);//не забываем поставить вывод через int
    }
    public static void main (String args[]){
        System.out.println(Task2.getMeters(1500)); //проверочка
    }
}
