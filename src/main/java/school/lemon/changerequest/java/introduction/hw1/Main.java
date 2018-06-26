import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Выберите задание(1-10)");
    int task = keyboard.nextInt();
    switch (task) {
      case 1:               // 1 задание
        double a = keyboard.nextInt();
        double p = 4 * a;
        System.out.println("p=" + p);
        break;
      case 2:               // 2 задание
        System.out.println("Введите количество сантиметров");
        double san = keyboard.nextInt();
        double met = san / 100;
        System.out.println("Сантиметров в метрах:" + met);
        break;
      case 3:               // 3 задание
        System.out.println("Введите числа a и c");
        double a2 = keyboard.nextInt();
        double c = keyboard.nextInt();
        System.out.println("Введите число b");
        double b = keyboard.nextInt();
        if (b > a2 && b < c || b < a2 && b > c) {
          System.out.println("Число b между чисел a и c");
        } else {
          System.out.println("Число b не между чисел a и c");
        }
        break;
      case 4:                // 4 задание
        double sum;
        System.out.println("Введите число а");
        double a3 = keyboard.nextInt();
        System.out.println("Введите число b");
        double b2 = keyboard.nextInt();
        System.out.println("Введите число c");
        double c2 = keyboard.nextInt();
        if (a3 < b2 && a3 < c2) {
          sum = b2 + c2;
          System.out.println("Сумма наибольших чисел =" + sum);
        } else if (b2 < a3 && b2 < c2) {
          sum = a3 + c2;
          System.out.println("Сумма наибольших чисел =" + sum);
        } else if (c2 < a3 && c2 < b2) {
          sum = a3 + b2;
          System.out.println("Сумма наибольших чисел =" + sum);
        }
        break;
      case 5:                             // 5 задание
        System.out.println("Введите z");
        double z = keyboard.nextInt();
        System.out.println("Введите x");
        double x = keyboard.nextInt();
        System.out.println("Введите y");
        double y = keyboard.nextInt();
        double b3;
        double a4;
        b3 = 1 + (Math.pow(z, 2) / (3 + (Math.pow(z, 2) / 5)));
        a4 = (2 * Math.sin(x - (Math.PI / 6)) * b3) / (0.5 + Math.pow(Math.sin(y), 2));
        System.out.println("a=" + a4);
        break;
      case 6:                             // 6 задание
        double z2;
        System.out.println("Ведите x");
        double x2 = keyboard.nextInt();
        System.out.println("Введие y");
        double y2 = keyboard.nextInt();
        double s;
        int fac1 = 1;
        int fac2 = 1;
        int fac3 = 1;
        z2 = Math.sin(Math.pow(x2, 3)) + Math.pow(Math.cos(y2), 2);
        for (int i = 1; i < 3; i++) {
          fac1 = fac1 * i;
        }
        for (int i = 1; i < 4; i++) {
          fac2 = fac2 * i;
        }
        for (int i = 1; i < 5; i++) {
          fac3 = fac3 * i;
        }
        s = 1 + x2 + Math.pow(x2, 2) / fac1 + Math.pow(x2, 3) / fac2 + Math.pow(x2, 4) / fac3;
        System.out.println("z=" + z2);
        System.out.println("s=" + s);
        break;
      case 7:                                     // 7 задание
        int index = keyboard.nextInt();
        switch (index) {
          case 1:
            System.out.println("Понедельник");
            break;
          case 2:
            System.out.println("Вторник");
            break;
          case 3:
            System.out.println("Среда");
            break;
          case 4:
            System.out.println("Четверг");
            break;
          case 5:
            System.out.println("Пятница");
            break;
          case 6:
            System.out.println("Суббота");
            break;
          case 7:
            System.out.println("Воскресенье");
            break;
          default:
            System.out.println("error");
            break;
        }
      case 8:                                       // 8 задание
        System.out.println("Введите n");
        double n = keyboard.nextInt();
        double i = 0;
        double result;
        for (result = 0; result != Math.pow(n * 2, 2); i++) {
          result = Math.pow(n, 2) + Math.pow(n + i, 2) + result;
        }
        System.out.println("Result=" + result);
        break;
      case 9:                                           // 9 задание
        System.out.println("Введие n");
        int n9 = keyboard.nextInt();
        if ( n9 % 3 == 0 || n9 ==3 || n9 == 9) {
          System.out.println("True");
        } else {
          System.out.println("False");
        }
        break;
      case 10:                                                // 10 задание
        System.out.println("Введие строку из чисел");
        String n3 = keyboard.next();
        boolean result3 = n3.contains("2");
        System.out.println(result3);
        break;
    }
  }
}