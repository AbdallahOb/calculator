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

    public static double divideTwoNumbers(int num1, int num2){
        double result = 0;
        try{
            result = num1/num2;
        }catch (ArithmeticException e){
            System.out.println(e);
        }

        return result;
    }

    public static int moduloTwoIntegerNumbers(int num1, int num2){

        return num1%num2;
    }

}
