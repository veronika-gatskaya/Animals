package main;

import animal.Animal;
import animal.impl.Cat;
import animal.impl.Dog;
import animal.impl.Horse;
import doctor.Doctor;

public class Program {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("food for cat", "grodno", true, "meow"),
                new Dog("food for dog", "grodno", false, "black"),
                new Horse("food for Horse", "grodno", false, "100000$")
        };
        Doctor doctor = new Doctor("Doctor Who");
        animalsList(animals, doctor);
    }

    public static void animalsList(Animal[] animals, Doctor doctor) {
        for (int i = 0; i < animals.length; i++) {
            Boolean isSleeping = animals[i].getIsSleeping();
            if (isSleeping == true) {
                System.out.println("Animal has been sleeping");
                animals[i].makeNoise();
                doctor.treatAnimal(animals[i]);
            } else {
                doctor.treatAnimal(animals[i]);
            }
        }
    }
}
