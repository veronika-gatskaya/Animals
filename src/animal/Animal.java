package animal;

public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return this.food;
    }

    public void setLocation(String locaion) {
        this.location = location;
    }

    public String getLocation() {
        return this.location;
    }

    protected void makeNoise() {
        System.out.println("Animal is active");
    }

    protected void eat() {
        System.out.println("Animal is eating");
    }

    protected void sleep() {
        System.out.println("Animal is sleeping");
    }
}
