package com.JavaBasics;

import java.util.Hashtable;

public class ExampleOfHashTable {
    public static void main(String[] args) {
        Hashtable<Integer,String> cars = new Hashtable<>();

        cars.put(1,"Audi");
        cars.put(2,"Benz");
        cars.put(3,"Ferrari");
        cars.put(4,"Suzuki");
        cars.put(5,"Honda");

        System.out.println("Cars list :" +cars.entrySet());

        System.out.println("Roll numbers :" + cars.keySet());

        System.out.println("Squad members names :" +cars.values());
    }
}
