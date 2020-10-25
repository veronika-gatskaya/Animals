package by.gatskaya.core.service.impl;

import by.gatskaya.core.enums.Location;
import by.gatskaya.core.exception.NullParameterException;
import by.gatskaya.core.model.animal.impl.Dog;
import by.gatskaya.core.service.AnimalService;

public class DogServiceImpl implements AnimalService<Dog> {
    public Dog createAnimal(String food, Location location, String color) throws NullParameterException {
        Dog dog = new Dog(food, location, color);
        if (food == null || location == null || color == null) {
            throw new NullParameterException(food, location, color);
        }
        return dog;
    }
}
