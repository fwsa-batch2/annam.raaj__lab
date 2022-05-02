package com.JavaBasics;

public class ExampleOfOverloading {
    // Overloading in constructors

    int id;
    String name;

    ExampleOfOverloading(){
        System.out.println("First constructor");
    }
    ExampleOfOverloading(int i , String n){
        id = i;
        name = n;
    }


    public static void main(String[] args){
        // Overloading in constructors
        ExampleOfOverloading myObj1 = new ExampleOfOverloading();
        System.out.println("id: " +myObj1.id+ "\nname: " +myObj1.name);

        ExampleOfOverloading myObj2 = new ExampleOfOverloading(1,"Pavan");
        System.out.println("id: " +myObj2.id+ "\nname: " +myObj2.name);


        // Overloading in methods
        int myNum = division(9,2);
        System.out.println("First Division: " +myNum);
        double myNum2 = division(9,2);
        System.out.println("Second Division: " +myNum2);

    }


    // Overloading in methods
    static int division(int x ,int y){
       return x/y;
    }

    static double division(double x , double y){
        return x/y;
    }
}
