package com.JavaBasics;

import java.util.*;

public class IteratingThroughSet {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<String>();


        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("B");
        hs.add("D");
        hs.add("E");


        for (String value : hs){
            System.out.print(value + " ");
        }
    }
}
