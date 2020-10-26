package by.gatskaya.core.service.impl;

import java.util.*;

import by.gatskaya.core.model.animal.Animal;
import by.gatskaya.core.model.doctor.Doctor;
import by.gatskaya.core.service.DoctorService;

public class DoctorServiceImpl implements DoctorService {
    public Doctor createDoctor(String name) {
        Doctor doctor = new Doctor(name);
        return doctor;
    }

    public void animalsList(Map<Doctor, List<Animal>> doctorsAnimals) {
        for(HashMap.Entry<Doctor, List<Animal>> item : doctorsAnimals.entrySet()){
            for(Animal animal : item.getValue()) {
                boolean isSleeping = animal.isSleeping();
                if (isSleeping) {
                    System.out.println("Animal has been sleeping");
                    animal.wake();
                }
                item.getKey().treatAnimal(animal);
            }
        }
    }
}
