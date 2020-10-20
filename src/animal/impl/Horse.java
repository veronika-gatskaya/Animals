package animal.impl;

import animal.Animal;

public class Horse extends Animal {
    String price;

    public Horse(String food, String location, String price) {
        super(food, location);
        this.price = price;
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse is active");
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Horse is sleeping");
    }
}
