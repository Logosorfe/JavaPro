package com.telran.prof.lessonsbeforespring.lesson2.extwo;

public class Ananas extends Fruit {

    private int cellulose;

    public Ananas() {
        System.out.println("Subclass constructor call");

        System.out.println("Subclass object hashcode : " + this.hashCode());
        System.out.println(this.hashCode() + " " + super.hashCode());

        System.out.println(this.getClass().getName() + " " + super.getClass().getName());
    }

    public int getCellulose() {
        return cellulose;
    }

    public void setCellulose(int cellulose) {
        this.cellulose = cellulose;
    }

    @Override
    public String toString() {
        return "Ananas{" + "cellulose=" + cellulose + " " + super.toString() + '}';
    }
}
