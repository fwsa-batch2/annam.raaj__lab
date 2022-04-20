package com.JavaBasics;

public class StrongNumber {
    public static void main(String[] args){
        int number = 40585, i , factorial , sum=0 , remainder , temp = number;
        while (number != 0 ){
            i=1;
            factorial = 1;
            remainder = number % 10;
            while (i <= remainder){
                factorial=factorial * i;
                i++;
            }
            System.out.println(" The Factorial of " + remainder + "  =  " + factorial);
           sum=sum+factorial;
            number=number/10;
        }

        if (temp == sum){
            System.out.println(temp+ " is a Strong Number.");
        }
        else{
            System.out.println(temp+ " is Not a Strong Number.");
        }
    }
}
