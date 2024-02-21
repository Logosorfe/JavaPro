package com.telran.prof.lessonfour.exampleenum;

public class OperationApp {

    public static void main(String[] args) {
        Operation opOne = new Operation("do homework", OperationState.NEW);
//        Operation opTwo = new Operation("check homework",
//                OperationState.COMPLETED, "COMPLET");
        Operation opTwo = new Operation("make homework", OperationState.COMPLETED);
        printAllCompletedOperation(opOne, opTwo);
        printAllCompletedOperation(opTwo);
//        EnumExample.checkDay(5);
//        String helloPhrase = EnumExample.helloPhrase;
    }

    private static void printAllCompletedOperation(Operation... operations) {
        for (Operation operation : operations) {
            //if("COMPLETED".equals(operation.getOperationState()))
            if (OperationState.COMPLETED == operation.getState()) {
                System.out.println("Operation is " + operation.getName() +
                        " " + operation.getState().getDescription());
            }
        }
    }
}
