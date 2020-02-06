package com.company;

import java.util.Objects;

public class MyintNum {
    private int number;

    public MyintNum(int number) {
        this.number = number;
    }

    public MyintNum() {
    }

    boolean hasCommonFactor(int number) {
        int gcd = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0 && this.number % i == 0) {
                gcd = i;
            }
        }
        return gcd != 0;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyintNum myintNum = (MyintNum) o;
        return number == myintNum.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "MyintNum{" +
                "number=" + number +
                '}';
    }
}
