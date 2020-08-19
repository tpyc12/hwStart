package hw5;

public class HomeWork5 {
    public static void main(String[] args) {

        Worker[] workers = new Worker[5];
        workers[0]= new Worker("Павел", "менеджер", "1@ya.ru",101, 25000, 18);
        workers[1]= new Worker("Максим", "Директор", "2@ya.ru",102, 125000, 35);
        workers[2]= new Worker("Олег", "повар", "3@ya.ru",103, 25500, 47);
        workers[3]= new Worker("Константин", "менеджер", "4@ya.ru",104, 26000, 26);
        workers[4]= new Worker("Илья", "менеджер", "5@ya.ru",105, 40000, 37);

        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge() > 40){
                workers[i].info();
            }
        }
    }
}
