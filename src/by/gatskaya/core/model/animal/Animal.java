package by.gatskaya.core.model.animal;

import by.gatskaya.core.enums.Location;

import java.util.Objects;

public abstract class Animal {
    private String food;
    private Location location;
    protected boolean sleeping;

    public Animal(String food, Location location) {
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

    public void setLocation(Location locaion) {
        this.location = location;
    }

    public Location getLocation() {
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

    @Override
    public String toString() {
        return "Animal" + location;
    }

    @Override
    public int hashCode() {
        return location.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return sleeping == animal.sleeping &&
                Objects.equals(food, animal.food) &&
                location == animal.location;
    }
}
