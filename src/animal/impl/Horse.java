package animal.impl;

import animal.Animal;

public class Horse extends Animal {
    String price;

    public Horse(String food, String location, Boolean isSleeping, String price) {
        super(food, location, isSleeping);
        this.price = price;
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse is active");
        isSleeping = false;
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating");
    }

    @Override
    public Boolean sleep() {
        System.out.println("Horse is sleeping *_*");
        Boolean isSleeping = true;
        return isSleeping;
    }
}
