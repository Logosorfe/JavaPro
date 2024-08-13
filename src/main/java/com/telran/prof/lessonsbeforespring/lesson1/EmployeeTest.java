package com.telran.prof.lessonsbeforespring.lesson1;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employeeOne = new Employee("Alex Alexeev", 35);
        Employee employeeTwo = new Employee("Oleg Olegov", 20);

        employeeOne.setPosition("CEO");
        employeeTwo.setPosition("Clerk");

        String positionOne = employeeOne.getPosition();
        String positionTwo = employeeTwo.getPosition();
        System.out.println("Position one " + positionOne);
        System.out.println("Position two " + positionTwo);

        employeeTwo.printEmployeeInfo();
    }
}
