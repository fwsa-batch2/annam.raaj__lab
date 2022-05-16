package com.JavaBasics;

import java.util.*;

public class AddAllSet {

        public static void main(String args[]) {

            Set<String> st1 = new TreeSet<String>();


            st1.add("Hi");
            st1.add("I");
            st1.add("Am");
            st1.add("Pavan");
            st1.add("Raaj");
            st1.add("Pavan");


            System.out.println("Set: " + st1);


            Set<String> st2 = new TreeSet<String>();


            st2.add("Hello");
            st2.add("World");


            st1.addAll(st2);


            System.out.println("Set: " + st1);
        }
    }
