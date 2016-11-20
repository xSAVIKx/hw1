package school.lemon.changerequest.java.introduction.hw1;


public class Task7 {
    public static String getDayTitle(int dayIndex)
    { String dayToString;

        switch (dayIndex)
        {
            case 1:
                dayToString = "Monday";
                break;
            case 2:
                dayToString = "Tuesday";
                break;
            case 3:
                dayToString = "Wednesday";
                break;
            case 4:
                dayToString = "Thursday";
                break;
            case 5:
                dayToString = "Friday";
                break;
            case 6:
                dayToString = "Saturday";
                break;
            case 7:
                dayToString = "Sunday";
                break;
            default: dayToString = "error";
                break;
        }
        return dayToString;
    }
}
