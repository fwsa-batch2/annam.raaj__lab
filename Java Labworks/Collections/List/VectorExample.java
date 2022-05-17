package com.JavaBasics;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> Vegetables = new Vector<>();
        Vegetables.add("Tomato");
        Vegetables.add("Potato");
        Vegetables.add("Carrot");
        System.out.println("Vegetables in Market: " +Vegetables);
        System.out.println("Vegetables after cloning: "+Vegetables.clone());
        Vegetables.removeElementAt(1);
        System.out.println("Vegetables in Market after removing: " +Vegetables);
    }
}
