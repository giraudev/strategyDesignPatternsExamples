package com.company;

public class Main {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(1,2));
        context = new Context(new OperationDivision());
        System.out.println(context.executeStrategy(1,2));
        context = new Context(new OperationMultiply());
        System.out.println(context.executeStrategy(1,2));
        context = new Context(new OperationSubstract());
        System.out.println(context.executeStrategy(1,2));
    }
}
