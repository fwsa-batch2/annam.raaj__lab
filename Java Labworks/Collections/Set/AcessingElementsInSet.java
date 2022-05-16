package com.JavaBasics;

import java.util.*;

public class AcessingElementsInSet {
    public static void main(String[] args)
    {

        Set<String> hs = new HashSet<String>();


        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("A");

        System.out.println("Set is " + hs);


        String check = "D";


        System.out.println("Contains " + check + " "
                + hs.contains(check));
    }
}
