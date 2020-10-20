package animal;

public class Animal {
    private String food;
    private String location;
    protected boolean sleeping;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
        sleeping = false;
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

    public void isSleeping(boolean sleeping) {
        this.sleeping = sleeping;
    }

    public boolean isSleeping() {
        return this.sleeping;
    }

    public void wake() {
        System.out.println("Animal is active");
        sleeping = false;
    }

    protected void eat() {
        System.out.println("Animal is eating");
    }

    public boolean sleep() {
        System.out.println("Animal is sleeping");
        sleeping = true;
        return sleeping;
    }
}
