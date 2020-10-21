package by.gatskaya.core.model.animal.impl;

import by.gatskaya.core.model.animal.Animal;
import by.gatskaya.core.model.animal.Location;

public class Horse extends Animal {
    private String price;

    public Horse(String food, Location location, String price) {
        super(food, location);
        this.price = price;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public void wake() {
        System.out.println("Horse is active");
        sleeping = false;
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating");
    }

    @Override
    public boolean sleep() {
        System.out.println("Horse is sleeping *_*");
        sleeping = true;
        return sleeping;
    }

    @Override
    public String toString() {
        return "Horse" + price;
    }

    @Override
    public int hashCode() {
        return price.hashCode();
    }
}
