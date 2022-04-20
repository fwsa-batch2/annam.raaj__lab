package com.JavaBasics;

public class FibonacciSeries {
    public static void main(String[] args){
        int number=3;
        int num1=0;
        int num2=1;
        int sum;
        System.out.println("Fibonacci Series of "+number+" is:");
        for (int i=1;i<=number;i++){

            sum=num1+num2;
            num1=num2;
            num2=sum;

            System.out.print(num1+ "\n");
        }

    }

}
