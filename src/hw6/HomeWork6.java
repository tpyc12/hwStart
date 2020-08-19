package hw6;

public class HomeWork6 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Dog");
        cat1.run(150);
        cat1.run(215);
        cat1.swim(100);
        Dog dog1 = new Dog("Cat");
        dog1.run(300);
        dog1.run(-515);
        dog1.swim(6);
        dog1.swim(12);
    }
}
