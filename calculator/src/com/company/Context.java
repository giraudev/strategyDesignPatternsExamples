package com.company;

public class Context {

    private IStrategy iStrategy;

    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public int executeStrategy(int num1, int num2){
        return iStrategy.doOperation(num1, num2);
    }
}
