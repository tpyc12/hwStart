package hw6;

public class Cat extends Animal{

    private static String name;

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= 200 && distance > 0) {
            super.run(distance);
        }else {
            System.out.println("Коты бегают на 200 метров.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плавать.");
    }
}
