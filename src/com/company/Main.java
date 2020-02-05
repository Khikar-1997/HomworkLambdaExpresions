package com.company;

public class Main {

    public static void main(String[] args) {
        String inStr = "Lambda Expressions Expand Java";
        String outStr;
        StringFunc stringFunc = ((text) -> text.replaceAll(" ", ""));
        outStr = LambdaArgumentDemo.changeStr(stringFunc, inStr);
        System.out.println(outStr);
    }
}

