package com.company;

public class Main {

    public static void main(String[] args) {
        MyTest myTest = ((number) -> number >= 10 && number <= 20);
        System.out.println(myTest.testing(15));
    }
}

