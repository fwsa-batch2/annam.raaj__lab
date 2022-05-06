package com.JavaBasics;

public class Calculator {
    int number1 , number2;  // Intance

    Calculator(int n1 , int n2){
        number1=n1;
        number2=n2;
    }

    public static int add(int number1 , int number2){
        return number1 + number2;
    }
    public static int subtraction(int number1 , int number2){
        return number1 - number2;
    }
    public static int division(int number1 , int number2){
        return number1 / number2;
    }

    public static void main(String[] args){

        Calculator result= new Calculator(3,2);
        System.out.println("Addition: " +add(result.number1, result.number2));
        System.out.println("Subtraction: " +subtraction(result.number1, result.number2));
        System.out.println("Division: " +division(result.number1, result.number2));



//        System.out.println("Addition : " +add(3,2));
//        System.out.println("Subtraction : " +subtraction(3,2));
//        System.out.println("Division : " +division(3,2));

    }


}



