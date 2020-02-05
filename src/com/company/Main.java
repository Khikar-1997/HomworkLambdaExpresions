package com.company;

public class Main {

    public static void main(String[] args) {
        MyFunc<Integer> myFunc = ((number) -> {
            int numberFactorial = 1;
            for (int i = 1; i <= number; i++) {
                numberFactorial *= i;
            }
            return numberFactorial;
        });
        System.out.println(myFunc.func(5));
    }
}

