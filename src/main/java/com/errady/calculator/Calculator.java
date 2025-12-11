package com.errady.calculator;

public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public String devide(int a, int b){
        if (b == 0){
            return "Error!";
        }
        return "" + a / b;
    }
}
