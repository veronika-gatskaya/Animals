package animal.impl;

import animal.Animal;

public class Dog extends Animal {

        String color;

        public Dog(String food, String location, String color) {
            super(food, location);
            this.color = color;
        }

        @Override
        public void makeNoise() {
            System.out.println("Dog is active");
        }

        @Override
        public void eat() {
            System.out.println("Dog is eating");
        }

        @Override
        public void sleep() {
           System.out.println("Dog is sleeping");
    }
}

