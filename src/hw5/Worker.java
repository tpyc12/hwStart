package hw5;

public class Worker {

    private String name;
    private String position;
    private String email;
    private int phoneNumber;
    private int wages;
    private int age;

    public Worker(String name, String position, String email, int phoneNumber, int wages, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.wages = wages;
        this.age = age;
    }

    public void info(){
        System.out.println("Имя сотрудника: " + name + "\nДолжность сотрудника: " + position +
                "\nemail сотрудника: " + email + "\nТелефон сотрудника: " + phoneNumber +
                "\nЗарплата сотрудника: " + wages + "\nВозраст сотрудника: " + age);
    }

    public int getAge() {
        return age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
