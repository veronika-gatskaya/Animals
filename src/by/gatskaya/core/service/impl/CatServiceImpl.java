package by.gatskaya.core.service.impl;

import by.gatskaya.core.enums.Location;
import by.gatskaya.core.exception.NullParameterException;
import by.gatskaya.core.model.animal.impl.Cat;
import by.gatskaya.core.service.AnimalService;

public class CatServiceImpl implements AnimalService<Cat> {
    public Cat createAnimal(String food, Location location, String name) throws NullParameterException {
        Cat cat = new Cat(food, location, name);
        if (food == null || location == null || name == null) {
            throw new NullParameterException (food, location, name);
        }
        return cat;
    }
}
