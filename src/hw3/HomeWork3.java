package hw3;

import java.util.Scanner;

public class HomeWork3 {

    public static Scanner scanner = new Scanner(System.in);
    public static int answer = 100;

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        int hiddenNumber = (int) (Math.random() * 9);
        int count = 3;
        System.out.println("Отгадайте число от 1 - 9 у Вас осталось " + count + " попыток.");
        while (hiddenNumber != answer && count != 0) {
            answer = scanner.nextInt();
            if (hiddenNumber > answer) {
                count--;
                System.out.println("Не верно! Загаданное число больше. У Вас осталось " + count + " попыток.");
            } else if (hiddenNumber < answer) {
                count--;
                System.out.println("Не верно! Загаданное число меньше. У Вас осталось " + count + " попыток.");
            } else {
                System.out.println("Поздравляю Вы победили!");
                break;
            }
        }
        startGameElse();
    }

    public static void startGameElse(){
        System.out.println("Сыграем еще раз? 1-да, 0-нет");
        int answerGame = scanner.nextInt();
        if (answerGame == 1){
            startGame();
        } else if (answerGame == 0){
            System.out.println("Хорошего дня!");
        }else {
            startGameElse();
        }
    }
}