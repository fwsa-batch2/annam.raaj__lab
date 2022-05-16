package com.JavaBasics;
import java.util.*;
public class SortedSetInterface {
    public static void main(String[] args){
        SortedSet<String> ts = new TreeSet<String>();
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("A");
        System.out.println("Sorted Set is " + ts);

        String check = "D";
        System.out.println("Contains " + check + " " + ts.contains(check));

        System.out.println("First Value " + ts.first());
        System.out.println("Last Value " + ts.last());

        System.out.println("Iterating over a Set");
        Iterator<String> i = ts.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
