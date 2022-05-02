public class Lesson3DzZinoviev {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        invertArray();
        System.out.println(""); // для перехода на следующую строку, что то не получилось по другому, а ждать ответа не хотелось.
        System.out.println("Задача 2");
        fillArray();
        System.out.println("");
        System.out.println("Задача 3");
        changeArray();
        System.out.println("");
        System.out.println("Задача 4");
        fillDiagonal();
        System.out.println("");
        System.out.println("Задача 5");
        Value();


    }

    public static void invertArray() {
        int[] arr = { 1, 0, 1, 0, 0, 1, 1, 0, 1, 1 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print("[" + arr[i] + "] ");
        }
    }
    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print("[" + arr[i] + "] ");

        }
    }

    public static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
                System.out.print("[" + arr[i] + "] ");
            }
        }
    }

    public static void fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print("[" + arr[i][j] + "] ");
           }
            System.out.println("");
        }
    }
    public static void Value(){
        int len = 10;
        int initialValue = 5;
        int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
                System.out.println("[" + i + "] - " + "[" + arr[i] + "] ");
                 }
    }

        }





