package by.gatskaya.core.model.doctor;

import by.gatskaya.core.model.animal.Animal;

public class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void treatAnimal(Animal animal) {
        System.out.println(animal.getFood() + " " + animal.getLocation());
    }

    @Override
    public String toString() {
        return "Doctor" + name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
