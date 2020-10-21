package by.gatskaya.core.service.impl;

import by.gatskaya.core.model.animal.Location;
import by.gatskaya.core.model.animal.impl.Horse;
import by.gatskaya.core.service.AnimalService;

public class HorseServiceImpl implements AnimalService {
    public Horse createAnimal(String food, Location location, String price) {
        Horse horse = new Horse(food, location, price);
        return horse;
    }
}
