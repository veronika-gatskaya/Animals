package by.gatskaya.core.service;

import by.gatskaya.core.model.animal.Animal;
import by.gatskaya.core.model.animal.Location;

public interface AnimalService<T extends Animal> {
    T createAnimal(String food, Location location, String param);
}
