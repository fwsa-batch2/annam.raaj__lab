package com.JavaBasics;

public class ConditionsStatements {
    public static void main(String[] args){
        int marks=40;
        if(marks<35){
            System.out.println("You are fail");
        }
        else if(marks == 35){
            System.out.println("You are just pass.");
        }
        else{
            System.out.println("You are pass");
        }

        String fruit="orange";
        switch (fruit){
            case "apple" :
                System.out.println("I love apple.");
                break;
            case "orange" :
                System.out.println("I love orange");
                break;
            default:
                System.out.println("I don't like fruits");
        }
    }
}

