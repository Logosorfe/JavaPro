package com.telran.prof.lessonsbeforespring.lesson23;

public class CalculatorApp {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(5, 7);
        int sub = calculator.sub(10, 2);

        System.out.println("Sum " + sum);
        System.out.println("Sub " + sub);
    }
}
