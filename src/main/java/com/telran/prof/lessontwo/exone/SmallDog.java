package com.telran.prof.lessontwo.exone;

public class SmallDog extends Dog {

    @Override
    public void voice() {
        super.voice();  // вызов метода voice из родительского класса
        System.out.println("Small dog voice!");
    }

    public void jump() {
        System.out.println("Small dog jump!");
    }
}
