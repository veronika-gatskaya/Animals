package animal.impl;

import animal.Animal;

public class Cat extends Animal {

    String name;

    public Cat(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat is active");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating *_*");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping *_*");
    }
}
