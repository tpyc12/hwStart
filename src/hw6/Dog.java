package hw6;

public class Dog extends Animal{

    private String name;

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= 500 && distance > 0) {
            super.run(distance);
        }else {
            System.out.println("Собаки бегают на 500 метров.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10 && distance > 0) {
            super.run(distance);
        }else {
            System.out.println("Собаки плавают на 10 метров.");
        }
    }
}
