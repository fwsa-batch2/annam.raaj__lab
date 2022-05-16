package com.JavaBasics;
import java.util.*;
public class RetainAllSet {
    public static void main(String[] argv) throws Exception
    {
        Set<Integer> arrset1 = new HashSet<Integer>();
        arrset1.add(1);
        arrset1.add(2);
        arrset1.add(3);
        arrset1.add(4);
        arrset1.add(5);
        System.out.println("Set before retainAll() operation : "+ arrset1);

        Set<Integer> arrset2 = new HashSet<Integer>();
        arrset2.add(6);
        arrset2.add(7);
        arrset2.add(8);
        arrset2.add(9);
        System.out.println("Collection Elements to be retained : "+ arrset2);

        arrset1.retainAll(arrset2);

        System.out.println("Set after retainAll() operation : "
                + arrset1);
    }
}
