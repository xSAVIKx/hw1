package school.lemon.changerequest.java.introduction.hw1;


public class Task4 {

    public static double getSumOfGreatest(double a, double b, double c) {

        double firstMax;
        if (a>b&&a>c){firstMax=a;}
        else if (b>c){firstMax=b;}
        else firstMax=c;
        double secondMax;
        if(a!=firstMax&&(a>b||a>c)){secondMax=a; }
        else if(b!=firstMax&&(b>c||b>a)){secondMax=b;}
        else secondMax=c;

        return firstMax+secondMax;
    }

    public static void main(String[] args) {



    }

}
