package by.gatskaya.core.service;

import by.gatskaya.core.model.doctor.Doctor;
import by.gatskaya.core.model.animal.Animal;

public interface DoctorService {
    Doctor createDoctor(String name);
    void animalsList(Animal[] animals, Doctor doctor);
}
