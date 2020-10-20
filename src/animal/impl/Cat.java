package animal.impl;

import animal.Animal;

public class Cat extends Animal {

    private String name;

    public Cat(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void wake() {
        System.out.println("Cat is active");
        sleeping = false;
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating *_*");
    }

    @Override
    public boolean sleep() {
        System.out.println("Cat is sleeping");
        sleeping = true;
        return sleeping;
    }
}
