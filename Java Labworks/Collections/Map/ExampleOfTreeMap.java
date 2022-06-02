package com.JavaBasics;
import java.util.*;
public class ExampleOfTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> Fruits = new TreeMap<>();

        Fruits.put(1,"Apple");
        Fruits.put(2,"Orange");
        Fruits.put(3,"Grapes");
        Fruits.put(4,"Banana");
        Fruits.put(5,"JackFruit");

        System.out.println("Fruits List :"+Fruits.entrySet());
        Fruits.put(5,"Lemon");
        System.out.println("Fruits after replacing :"+Fruits.entrySet());

        System.out.println("Roll numbers of Fruits :" +   Fruits.keySet());

        System.out.println("Fruits names :" +Fruits.values());

        String removedVal = Fruits.remove(5);
        System.out.println("Removed Value :" +removedVal);
        System.out.println("Final set of fruits :"+Fruits.entrySet());


    }
}
