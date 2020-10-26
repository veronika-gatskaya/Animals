package by.gatskaya;

import by.gatskaya.core.model.animal.Animal;
import by.gatskaya.core.model.animal.impl.Cat;
import by.gatskaya.core.model.animal.impl.Dog;
import by.gatskaya.core.model.animal.impl.Horse;
import by.gatskaya.core.model.doctor.Doctor;
import by.gatskaya.core.service.DoctorService;
import by.gatskaya.core.service.impl.CatServiceImpl;
import by.gatskaya.core.service.impl.DoctorServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static by.gatskaya.core.enums.Location.GRODNO;

public class Program {
    private static DoctorService doctorService = new DoctorServiceImpl();
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Cat cat1 = new Cat("food", GRODNO, "meow");
        Dog dog1 = new Dog("food", GRODNO, "black");
        animals.add(cat1);
        animals.add(dog1);
        Doctor doctor = new Doctor("Doctor Who");
        Map<Doctor, List<Animal>> doctorArrayListHashMap = new HashMap<>();
        doctorArrayListHashMap.put(doctor, animals);
        doctorService.animalsList(doctorArrayListHashMap);
    }
}
