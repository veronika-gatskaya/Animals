package by.gatskaya.core.model.animal.impl;

import by.gatskaya.core.model.animal.Animal;
import by.gatskaya.core.enums.Location;

import java.util.Objects;

public class Dog extends Animal {

        private String color;

        public Dog(String food, Location location, String color) {
            super(food, location);
            this.color = color;
        }

        public String getColor() {
            return this.color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public void wake() {
            System.out.println("Dog is active");
            sleeping = false;
        }

        @Override
        public void eat() {
            System.out.println("Dog is eating");
        }

        @Override
        public boolean sleep() {
            System.out.println("Dog is sleeping");
            sleeping = true;
            return sleeping;
        }

        @Override
        public String toString() {
            return "Dog" + color;
        }

        @Override
        public int hashCode() {
        return color.hashCode();
    }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            Dog dog = (Dog) o;
            return Objects.equals(color, dog.color);
         }
}

