package Lesson2DzZinoviev;

public class Lesson2Zinoviev {
    public static void main(String[] args) {

        sumBetwen20And10();
        positiveNegative();
        negative();
        stringNumber();
        visokosni();
        System.out.println(sumBetwen20And10() + " SUM");
        System.out.println(negative() + " Negative");
        System.out.println(visokosni() + " Высокосный");
    }


    public static boolean sumBetwen20And10() {
        int a = 5;
        int b = 1;
        int c;
        c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void positiveNegative() {
        int a = - 5;
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean negative() {
        int a = - 6;
        return a < 0;
    }

    public static void stringNumber() {
        int b = 3;
       while (b > 0) {
            System.out.println("Cnhjxrf");
            b --;
        }
    }
     public static boolean visokosni() {
        /* логика задачи n - год
        1. n/4 - без остатка высокосный при n<100
        2. n/4 и n/400 без остатка + n/100 как то убрать    - высокосный
        3. поиск выдал такой оператор %. деление по модулю в методичке (не понятно, яндекс лучше объяснил).
         */
     int n = 700;
        if (n < 100) {
            return n % 4 == 0;
        }
        if ( n > 100) {
            return n % 4 == 0 && n % 100 != 0 || n % 400 == 0; //3 дня собирал формулу
        }
        else {
         return false; }
     }
}