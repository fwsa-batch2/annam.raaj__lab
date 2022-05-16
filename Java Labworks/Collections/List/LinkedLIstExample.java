package com.JavaBasics;

import java.util.LinkedList;

public class LinkedLIstExample {
    public static void main(String[] args) {
        LinkedList<Integer> Roll_no = new LinkedList<>();
        Roll_no.add(1);
        Roll_no.add(2);
        Roll_no.add(3);
        Roll_no.add(5);
        Roll_no.addFirst(0);
        Roll_no.add(4,4);
        Roll_no.add(6);
        Roll_no.add(7);
        Roll_no.add(8);
        Roll_no.add(9);
        Roll_no.addLast(10);
        Roll_no.remove(0);

        System.out.println("FWSA Rool_no. : " + Roll_no);
        System.out.println("Size: "+ Roll_no.size());

    }
}
