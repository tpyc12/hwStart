package hw6;

public class Animal {

    private static String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void run (int distance){
        System.out.println(name + " пробежал " + distance + " метров.");
    }

    public void swim (int distance){
        System.out.println(name + " проплыл " + distance + " метров.");
    }
}
