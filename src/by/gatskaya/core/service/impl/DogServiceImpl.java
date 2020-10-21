package by.gatskaya.core.service.impl;

import by.gatskaya.core.model.animal.Location;
import by.gatskaya.core.model.animal.impl.Dog;
import by.gatskaya.core.service.AnimalService;

public class DogServiceImpl implements AnimalService {
    public Dog createAnimal(String food, Location location, String color) {
        Dog dog = new Dog(food, location, color);
        return dog;
    }
}
