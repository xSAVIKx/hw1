package school.lemon.changerequest.java.introduction.hw1;


public class Task10 {

    public static boolean containDigitTwo(int n)
    {
        int j=2;
        for (int i = 1; i < j; i++)
        {
            float Num = n /10f;
            int Raz=(int)((Num-(int)Num)*10);
            if (Raz == 2)
            {
                return true;
            }
            if ((int)Num == 0)
            {
                break;
            }
            n=(int)Num;
            j++;
        }
        return false; // Test 10 done.
    }
}
