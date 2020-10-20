package animal.impl;

import animal.Animal;

public class Dog extends Animal {

        String color;

        public Dog(String food, String location, Boolean isSleeping, String color) {
            super(food, location, isSleeping);
            this.color = color;
        }

        @Override
        public void makeNoise() {
            System.out.println("Dog is active");
            isSleeping = false;
        }

        @Override
        public void eat() {
            System.out.println("Dog is eating");
        }

        @Override
        public Boolean sleep() {
            System.out.println("Dog is sleeping *_*");
            Boolean isSleeping = true;
            return isSleeping;
        }
}

