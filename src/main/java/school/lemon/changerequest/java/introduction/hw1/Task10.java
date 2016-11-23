package school.lemon.changerequest.java.introduction.hw1;


public class Task10 {

    public static boolean containDigitTwo(int n) {

        while (n > 0) {

            if (n % 10 == 2) {
                return true;
            }
            n = n / 10;
        }
        return false;
    }

    //        вариант 1:
//        String number = Integer.toString(n);
//        boolean isContain2 = number.contains("2");
//        return isContain2;
//        вариант 2:
//        String number = Integer.toString(n);
//        for (int i = 0; i < number.length(); i++) {
//            if (number.charAt(i) == '2') {
//                return true;
//            }
//        }
//        return false;
//    }
    public static void main(String[] args) {
        System.out.println(containDigitTwo(29914));
    }
}




