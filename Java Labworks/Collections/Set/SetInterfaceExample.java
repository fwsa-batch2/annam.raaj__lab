package com.JavaBasics;

import java.util.*;

public class SetInterfaceExample {

    public static void main(String[] args)
    {

        HashSet<String> hash_Set = new HashSet<>();


        hash_Set.add("Hello");
        hash_Set.add("I");
        hash_Set.add(null);
        hash_Set.add("Am");
        hash_Set.add("Pavan");
        hash_Set.add("Hello");
        hash_Set.add("World");
        System.out.println("Original Set: "+hash_Set);

        System.out.println("Size before Removing an element: " +hash_Set.size());
        String check = "Hello";
        System.out.println("Check Hello "+hash_Set.contains(check));
        System.out.println(hash_Set.hashCode());
        hash_Set.remove("I");
        System.out.println("Final result after removing: "+hash_Set);
        System.out.println("Size after Removing an element: " +hash_Set.size());



    }

}
