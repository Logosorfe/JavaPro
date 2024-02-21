package com.telran.prof.lessonfour.exampleenum;

public class Operation {

    private String name;

    private OperationState state;

    public Operation(String name, OperationState state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public OperationState getState() {
        return state;
    }
}
