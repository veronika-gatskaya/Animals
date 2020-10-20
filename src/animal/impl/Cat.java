package animal.impl;

import animal.Animal;

public class Cat extends Animal {

    String name;

    public Cat(String food, String location, Boolean isSleeping, String name) {
        super(food, location, isSleeping);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat is active");
        isSleeping = false;
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating *_*");
    }

    @Override
    public Boolean sleep() {
        System.out.println("Cat is sleeping *_*");
        isSleeping = true;
        return isSleeping;
    }
}
