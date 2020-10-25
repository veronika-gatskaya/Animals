package by.gatskaya.core.service;

import by.gatskaya.core.exception.NullParameterException;
import by.gatskaya.core.model.animal.Animal;
import by.gatskaya.core.enums.Location;

public interface AnimalService<T extends Animal> {
    T createAnimal(String food, Location location, String param) throws NullParameterException;
}
