package com.JavaBasics;

import java.util.*;

public class HowToFindHashCodeSet {
    public static void main(String[] args)
    {

        Set<Integer> arr = new HashSet<Integer>();


        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);


        System.out.println("Set: " + arr);


        System.out.println("HashCode value: " + arr.hashCode());

        System.out.println();


            Set<String> arr1 = new HashSet<String>();


            arr1.add("Hi");
            arr1.add("I");
            arr1.add("Am");
            arr1.add("Pavan");


            System.out.println("Set: " + arr1);


            System.out.println("HashCode value: "
                    + arr1.hashCode());

    }
}
