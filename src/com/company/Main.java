package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        MyintNum myintNum = new MyintNum(8);
        Random random = new Random();
        int number = random.nextInt(15);
        IntPredicate result = myintNum::hasCommonFactor;
        System.out.println(number);
        System.out.println(result.test(number));
    }
}

