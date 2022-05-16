package com.JavaBasics;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetExample {
    public static void main(String[] args){
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("A");
        System.out.println("Tree Set is " + ts);

        String check = "A";
        System.out.println("Contains " + check + " " + ts.contains(check));

        System.out.println("First Value " + ts.first());
        System.out.println("Last Value " + ts.last());
        // pollFirst will remove the first element
        System.out.println("First element of the Set is : " + ts.pollFirst());
        // pollLast will remove the last element
        System.out.println("The Last element of the set: " + ts.pollLast());
        System.out.println("After removing the first and last the Tree Set is " + ts);
    }
}
