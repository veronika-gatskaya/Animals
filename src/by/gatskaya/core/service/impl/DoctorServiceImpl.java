package by.gatskaya.core.service.impl;

import java.util.Date;
import by.gatskaya.core.model.animal.Animal;
import by.gatskaya.core.model.doctor.Doctor;
import by.gatskaya.core.service.DoctorService;

public class DoctorServiceImpl implements DoctorService {
    public Doctor createDoctor(String name) {
        Doctor doctor = new Doctor(name);
        return doctor;
    }

    public void animalsList(Animal[] animals, Doctor doctor) {
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
