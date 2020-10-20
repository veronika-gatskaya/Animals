package main;

import animal.Animal;
import animal.impl.Cat;
import animal.impl.Dog;
import animal.impl.Horse;
import doctor.Doctor;

public class Program {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("food for cat", "grodno",  "meow"),
                new Dog("food for dog", "grodno",  "black"),
                new Horse("food for Horse", "grodno",  "100000$")
        };
        Doctor doctor = new Doctor("Doctor Who");
        animals[0].sleep();
        animalsList(animals, doctor);
    }

    public static void animalsList(Animal[] animals, Doctor doctor) {
        for (Animal animal : animals) {
            boolean isSleeping = animal.isSleeping();
            if (isSleeping) {
                System.out.println("Animal has been sleeping");
                animal.wake();
            }
            doctor.treatAnimal(animal);
        }
    }
}
