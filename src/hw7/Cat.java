package hw7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public void info(){
        System.out.println("Имя:" + name + " Аппетит:" + appetite + " Сытость:" + fullness);
    }

    public void eat(Plate p){
        if (p.getFood() > appetite) {
            p.decreaseFood(appetite);
            fullness = true;
        }else   {
            fullness = false;
        }
    }

}
