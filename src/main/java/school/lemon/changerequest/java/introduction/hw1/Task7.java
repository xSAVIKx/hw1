package school.lemon.changerequest.java.introduction.hw1;


public class Task7 {
    public static String getDayTitle(int dayIndex) {
        String day;
        switch (dayIndex){
            case 1: day = "Monday";
                break;
            case 2: day = "Tuesday";
                break;
            case 3: day = "Wednesday";
                break;
            case 4: day = "Thursday";
                break;
            case 5: day = "Friday";
                break;
            case 6: day = "Saturday";
                break;
            case 7: day = "Sunday";
                break;
                default: day = "error";
                    break;
        }

        return day;
    }

    public static void main(String[] args) {
        System.out.println(getDayTitle(-1));
    }
}
