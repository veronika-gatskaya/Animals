package by.gatskaya.core.service.impl;

import by.gatskaya.core.enums.Location;
import by.gatskaya.core.exception.NullParameterException;
import by.gatskaya.core.model.animal.impl.Horse;
import by.gatskaya.core.service.AnimalService;

public class HorseServiceImpl implements AnimalService<Horse> {
    public Horse createAnimal(String food, Location location, String price) throws NullParameterException {
        Horse horse = new Horse(food, location, price);
        if (food == null || location == null || price == null) {
            throw new NullParameterException (food, location, price);
        }
        return horse;
    }
}
