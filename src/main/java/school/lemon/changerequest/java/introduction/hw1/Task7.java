package school.lemon.changerequest.java.introduction.hw1;


public class Task7 {
    public static String getDayTitle(int dayIndex) {
        String weekDay;
        switch (dayIndex){
            case 1:
                weekDay = "Monday";
                break;
            case 2:
                weekDay = "Tuesday";
                break;
            case 3:
                weekDay = "Wednesday";
                break;
            case 4:
                weekDay = "Thursday";
                break;
            case 5:
                weekDay = "Friday";
                break;
            case 6:
                weekDay = "Saturday";
                break;
            case 7:
                weekDay = "Sunday";
                break;
            default:
                weekDay = "error";
                break;
        }
        return weekDay;
    }

    public static void main(String[] args) {
        System.out.println(getDayTitle(8));
    }
}
