package com.JavaBasics;

public class PerfectNumber {
    public static void main(String[] args){
        int number = 28 ;
        int sum = 0;
        int i = 1;
        while (i <= number/2){
            if (number%i == 0){
                sum = sum + i ;
            }
            i ++;
        }

        if (sum == number){
            System.out.println(number+ " is Perfect Number.");
        }
        else {
            System.out.println(number+ " is not Perfect Number." );
        }
    }
}
