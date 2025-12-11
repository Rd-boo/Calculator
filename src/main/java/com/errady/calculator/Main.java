package com.errady.calculator;

public class Main {

    public static void main(String[] args) {

        Calculator cl = new Calculator();

        int sum = cl.add(6, 4);
        System.out.println("Somme: "+ sum);

        String div = cl.devide(10, 2);
        System.out.println("Division: "+ div);
    }
}
