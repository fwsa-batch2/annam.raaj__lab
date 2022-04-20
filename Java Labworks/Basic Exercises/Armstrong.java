package com.JavaBasics;

public class Armstrong {
    public static void main(String[] args){
        int number = 371 , remainder , result , originalNumber;
        originalNumber = number;
        result = 0;
        while (originalNumber != 0 ){
            remainder = originalNumber%10;
            result += Math.pow(remainder,3);
            originalNumber /= 10;

        }

        if (result == number){
            System.out.println(number + " is Armstrong Number.");
        }

        else {
            System.out.println(number + " is not Armstrong Number.");
        }
    }
}
