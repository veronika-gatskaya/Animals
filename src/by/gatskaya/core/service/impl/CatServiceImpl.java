package by.gatskaya.core.service.impl;

import by.gatskaya.core.model.animal.Location;
import by.gatskaya.core.model.animal.impl.Cat;
import by.gatskaya.core.service.AnimalService;

public class CatServiceImpl implements AnimalService {
    public Cat createAnimal(String food, Location location, String name) {
        Cat cat = new Cat(food, location, name);
        return cat;
    }
}
