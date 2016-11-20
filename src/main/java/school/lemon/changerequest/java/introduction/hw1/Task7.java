package school.lemon.changerequest.java.introduction.hw1;


public class Task7 {
    public static String getDayTitle(int dayIndex) {

        String day_num;

        switch (dayIndex )
        {
            case 1 : day_num = "Monday";
            break;
            case 2 : day_num = "Tuesday";
            break;
            case 3 : day_num = "Wednesday";
            break;
            case 4 : day_num = "Thursday";
            break;
            case 5 : day_num = "Friday";
            break;
            case 6 : day_num = "Saturday";
            break;
            case 7 : day_num = "Sunday";
            break;
            default: day_num = "error";
            break;
        }
return day_num;
    }
}
