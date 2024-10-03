package com.telran.prof.lessonsbeforespring.lesson1;

public class TestPuppy {

    public static void main(String[] args) {
        Puppy smallPuppy = new Puppy();
        String nameSmallPuppy = smallPuppy.name;
        System.out.println("Name small puppy = " + nameSmallPuppy);
        smallPuppy.name = "Barbosik";
        System.out.println("Name small puppy = " + smallPuppy.name);

        Puppy middlePuppy = new Puppy();
        String nameMiddlePappy = middlePuppy.name;
        System.out.println("Name middle pappy = " + nameMiddlePappy);

        Dog bigDog = new Dog();

        Puppy bigPuppy;
        bigPuppy = new Puppy();
        String nameBigPuppy = bigPuppy.name;
        System.out.println("Name big puppy = " + nameBigPuppy);

        Puppy namedPuppy = new Puppy("Baget");
        String nameNamedPuppy = namedPuppy.name;
        System.out.println("Name name puppy = " + nameNamedPuppy);

        Puppy fullReadyPuppy = new Puppy("Corchik", 1);
        System.out.println("Name full ready puppy = " + fullReadyPuppy.name);
        System.out.println("Age full ready puppy = " + fullReadyPuppy.age);

    }
}
