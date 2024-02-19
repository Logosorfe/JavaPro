package com.telran.prof.lessonthree.exampleinterface;

public class ExampleInterface {

    public static void main(String[] args) {
        Bird bird = new Bird();
        Bird bird1 = new Bird();

        String flyName = bird.FLY_NAME;
        String flyName1 = Flyable.FLY_NAME;
        String flyName2 = Bird.FLY_NAME;

    }
}
