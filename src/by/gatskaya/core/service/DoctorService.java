package by.gatskaya.core.service;

import by.gatskaya.core.model.doctor.Doctor;
import by.gatskaya.core.model.animal.Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DoctorService {
    Doctor createDoctor(String name);
    void animalsList(Map<Doctor, List<Animal>> doctorsAnimals);
}
