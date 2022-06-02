package com.JavaBasics;

import java.util.HashMap;

public class ExampleHashMap {
    public static void main(String[] args) {
        HashMap<Integer , String> Usquare = new HashMap<>();

        Usquare.put(1,"Pavan");
        Usquare.put(2,"Sugu");
        Usquare.put(3,"Keerthana");
        Usquare.put(4,"Deepak");
        Usquare.put(5,"Kasi");

        System.out.println("U2 squad members :" + Usquare);

        System.out.println("Roll numbers :" + Usquare.keySet());

        System.out.println("Squad members names :" +Usquare.values());

        System.out.println("U2 :" +Usquare.entrySet());

        String removedValue = Usquare.remove(4);
        System.out.println("Removed Value :" +removedValue);
        System.out.println("Finally U2 :" +Usquare);
    }


}
