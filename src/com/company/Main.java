package com.company;

public class Main {

    public static void main(String[] args) {
        NumericFunc numericFunc = ((number) -> {
            int numberFactorial = 1;
            for (int i = 1; i <= number; i++) {
                numberFactorial *= i;
            }
            return numberFactorial;
        });
        System.out.println(numericFunc.func(5));
    }
}
