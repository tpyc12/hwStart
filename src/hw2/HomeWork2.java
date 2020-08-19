package hw2;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
//        Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
//        [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] arr = {1, 0, 0, 0, 1, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));

//        Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его
//        значениями 0 3 6 9 12 15 18 21;

        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr2));

//        Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
//        и числа меньшие 6 умножить на 2;

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr3));

//        Создать квадратный двумерный целочисленный массив (количество строк и столбцов
//        одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if (arr4[i] == arr4[j] || i + j == arr4.length - 1) {
                    arr4[i][j] = 1;
                } else {
                    arr4[i][j] = 0;
                }
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

//        ** Задать одномерный массив и найти в нем минимальный и максимальный элементы
//        (без помощи интернета);

        int[] arr5 = {37, 2, 3, 4, 5, 67, 8, 9};
        int min = arr5[0];
        int max = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (min > arr5[i]) {
                min = arr5[i];
            } else {
                continue;
            }
            System.out.println("min = " + min);
        }
        for (int i = 0; i < arr5.length; i++) {
            if (max < arr5[i]) {
                max = arr5[i];
            } else
            System.out.println("max = " + max);
        }

//        ** Написать метод, в который передается не пустой одномерный целочисленный массив,
//        метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой
//        части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
//        checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы
//        в массив не входят.

//         **** Написать метод, которому на вход подается одномерный массив и число n
//         (может быть положительным, или отрицательным), при этом метод должен сместить все
//         элементымассива на n позиций. Для усложнения задачи нельзя пользоваться
//         вспомогательными массивами.

        int[] arr6 = {1, 0, 3, 4, 5, 6, 7};
        System.out.println(checkBalance(arr6));
        System.out.println(Arrays.toString(moveArray(arr6, 3)));
    }

    //    Метод списал у Вас, но полностью в нем разобрался.
//    Каждый раз прихожу в восторг, насколько все логично в программировании, спасибо.
    public static boolean checkBalance(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        int sumLeft = 0;
        int i = 0;
        while (sumLeft < sum / 2) {
            sumLeft += arr[i];
            i++;
        }
        return sumLeft == sum / 2;
    }

    //Сам не решил, метод списал у Вас.
    public static int[] moveArray(int[] arr, int n) {
        int m = n % arr.length + arr.length;
        for (int i = 0; i < m; i++) {
            int tmp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = tmp;
        }
        return arr;
    }
}

