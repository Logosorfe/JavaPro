package com.telran.prof.lessonsbeforespring.lesson3.exampleinterface;

public class ExampleInterface {

    public static void main(String[] args) {
        Bird bird = new Bird();
        Bird bird1 = new Bird();

        String flyName = bird.FLY_NAME;
        String flyName1 = Flyable.FLY_NAME;
        String flyName2 = Bird.FLY_NAME;

        AirPlane airPlane = new AirPlane();

        Flyable[] flyables = {bird, bird1, airPlane};
        for (Flyable flyable : flyables) {
            flyable.fly();
        }

        Cat cat = new Cat();

        AbleToEat[] ableToEats = {bird, bird1, cat};
        for (AbleToEat element : ableToEats) {
            element.eat();
        }
    }
}
