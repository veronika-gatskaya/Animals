package by.gatskaya.core.model.animal.impl;

import by.gatskaya.core.model.animal.Animal;
import by.gatskaya.core.enums.Location;

import java.util.Objects;

public class Cat extends Animal {

    private String name;

    public Cat(String food, Location location, String name) {
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

    @Override
    public String toString() {
        return "Cat" + name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }
}
