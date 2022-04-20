package com.JavaBasics;

public class Reverse {
    public static void main(String[] args){

        int num = 446, temp = num , reverse = 0 , reminder = 0;
        while (num != 0) {
            reminder = num % 10;
            reverse = (reverse * 10) + reminder;
            num = num / 10;

        }
        System.out.println("The reverse number of " + temp + " is " + reverse);

    }

    }

