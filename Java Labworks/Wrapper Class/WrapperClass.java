package com.JavaBasics;

public class WrapperClass {
    public static void main(String args[]){
        // boxing
        double x = 2;
        Double obj1 = Double.valueOf(x);
        Double obj2 = x;    //Auto-boxing
        System.out.println("Primitive Data type to object : " + obj1);
        System.out.println("Primitive Data Type to object : " + obj2);

        // unboxing
        long my_obj = 29387487485L;
        Long y = my_obj;
        System.out.println("Changing object to primitive : " + y);
    }

}
