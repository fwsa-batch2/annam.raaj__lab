package com.JavaBasics;
import java.util.*;
public class ExampleOfLInkedHashMap {
    public static void main(String[] args) {

        LinkedHashMap<String,String> animal=new LinkedHashMap<>();

        animal.put("one","dog");
        animal.put("two","cat");
        animal.put("three","buffalo");
        animal.put("four","pig");
        animal.put("five","lion");

        System.out.println("Maps :"+animal);

        System.out.println("keys :"+animal.keySet());

        System.out.println("values :"+animal.values());

        System.out.println("Entries :"+animal.entrySet());

        String value=animal.remove("four");
        System.out.println("removed value :"+value);
        System.out.println("result :"+animal);

    }
}
