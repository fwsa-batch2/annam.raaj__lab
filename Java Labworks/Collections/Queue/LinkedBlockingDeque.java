package com.JavaBasics;
import java.util.Collection;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.*;
public class LinkedBlockingDeque {
    public static void main(String[] args) throws InterruptedException {

        // Instantiate a LinkedBlockingDeque named lbdq1
        java.util.concurrent.LinkedBlockingDeque lbdq1 = new java.util.concurrent.LinkedBlockingDeque();

        // Add elements using add()
        lbdq1.add(145);
        lbdq1.add(89);
//        lbdq1.putFirst(1);
        lbdq1.add(65);
        lbdq1.putLast(1);
        lbdq1.put(122);
        lbdq1.put(11);

        // Print the contents of lbdq1 on the console
        System.out.println("Contents of lbdq1: " + lbdq1);

        // Instantiate a LinkedBlockingDeque named lbdq2
        java.util.concurrent.LinkedBlockingDeque lbdq2 = new java.util.concurrent.LinkedBlockingDeque();

        // Add elements from lbdq1 using addAll()
        lbdq2.addAll(lbdq1);

        // Print the contents of lbdq2 on the console
        System.out.println("\nContents of lbdq2: " + lbdq2);

    }

}


