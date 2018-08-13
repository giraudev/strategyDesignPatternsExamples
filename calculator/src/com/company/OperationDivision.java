package com.company;

public class OperationDivision implements IStrategy {
    @Override
    public int doOperation(int num1, int num2) {
        if(num1>=num2){
            return num1/num2;
        }else {
            return num2/num1;
        }
    }
}
