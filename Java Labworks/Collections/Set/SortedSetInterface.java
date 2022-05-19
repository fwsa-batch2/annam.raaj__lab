package com.JavaBasics;
import java.util.*;
public class SortedSetInterface {
    public static void main(String[] args){
        SortedSet<Integer> ts = new TreeSet<>();
        ts.add(3);
        ts.add(5);
        ts.add(6);
        ts.add(1);
        System.out.println("Sorted Set is " + ts);

//        String check = "D";
//        System.out.println("Contains " + check + " " + ts.contains(check));

        System.out.println("First Value " + ts.first());
        System.out.println("Last Value " + ts.last());

        System.out.println("Iterating over a Set");
        Iterator<Integer> i = ts.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
