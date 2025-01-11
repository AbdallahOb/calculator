package org.example;

public class Calculator {
    public static int addTwoNumbers(int num1, int num2){
        return num1+num2;
    }

    public static int subtractTwoNumbers(int num1, int num2){
        return num1-num2;
    }

    public static int multiplyTwoNumbers(int num1, int num2){
        return num1*num2;
    }

    public static int divideTwoNumbers(int num1, int num2){
        return num1/num2;
    }

    //Conflict scenario both will add modulo method
    public static int moduloTwoIntegerNumbers(int num1, int num2){
        return num1%num2;
    }

}
