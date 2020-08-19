package hw1;

public class HomeWork1 {

    //    1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
    public static void main(String[] args) {

        //    2. Создать переменные всех пройденных типов данных и инициализировать их значения.
        /*byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;
        float e = 5.0f;
        double f = 6.0;
        char g = 75;
        boolean h = true;*/

        //  Проверка всех методоов.
        System.out.println(result(10.1f, 3, 9.4f, 2));
        System.out.println(result1(3, 10));
        System.out.println(result1(3, 20));
        positiveNumber(3);
        positiveNumber(-19);
        System.out.println(negativeNumber(0));
        System.out.println(negativeNumber(-23));
        greeting("Павел");
        leapYear(40);
        leapYear(100);
        leapYear(400);
    }

    //    3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //    где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float result(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    //    4. Написать метод, принимающий на вход два целых числа и проверяющий,
    //    что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    //    в противном случае – false.
    public static boolean result1(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    //    5. Написать метод, которому в качестве параметра передается целое число,
    //    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    //    Замечание: ноль считаем положительным числом.
    public static void positiveNumber(int a) {
        if (a >= 0) {
            System.out.println("Данное число положительное");
        } else {
            System.out.println("Данное число отрицательное");
        }
    }

    //    6. Написать метод, которому в качестве параметра передается целое число.
    //    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean negativeNumber(int a) {
        return a < 0;
    }

    //    7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    //    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void greeting(String name) {
        System.out.println("Привет, " + name + "!");
    }

    //8. *Написать метод, который определяет, является ли год високосным,
    // и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го,
    // при этом каждый 400-й – високосный.
    public static void leapYear(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println("Данный год високосный");
        } else {
            System.out.println("Данный год не високосный");
        }
    }
}
