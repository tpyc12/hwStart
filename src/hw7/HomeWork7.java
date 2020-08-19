package hw7;

public class HomeWork7 {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik",40,false);
        cats[1] = new Cat("Boris",40,false);
        cats[2] = new Cat("Dog",40,false);

        Plate plate = new Plate(100);
        plate.info();

        cats[0].eat(plate);
        cats[1].eat(plate);
        cats[2].eat(plate);
        cats[0].info();
        cats[1].info();
        cats[2].info();

        plate.addFood(100);

        cats[2].eat(plate);
        cats[2].info();
    }
}
