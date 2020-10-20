package doctor;

import animal.Animal;

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
}
