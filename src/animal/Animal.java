package animal;

public class Animal {
    private String food;
    private String location;
    protected Boolean isSleeping;

    public Animal(String food, String location, Boolean isSleeping) {
        this.food = food;
        this.location = location;
        this.isSleeping = isSleeping;
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

    public void setIsSleeping(Boolean isSleeping) {
        this.isSleeping = isSleeping;
    }

    public Boolean getIsSleeping() {
        return this.isSleeping;
    }

    public void makeNoise() {
        System.out.println("Animal is active");
        isSleeping = false;
    }

    protected void eat() {
        System.out.println("Animal is eating");
    }

    public Boolean sleep() {
        System.out.println("Animal is sleeping");
        isSleeping = true;
        return isSleeping;
    }
}
