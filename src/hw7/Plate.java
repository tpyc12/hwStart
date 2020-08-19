package hw7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood(int add){
        food += add;
    }

    public void decreaseFood(int n) {
        if (food >= n){
            food -= n;
        }else  {
            System.out.println("Еды не хватает, чтобы насытить кота.");
        }
    }

    public int getFood() {
        return food;
    }
}
