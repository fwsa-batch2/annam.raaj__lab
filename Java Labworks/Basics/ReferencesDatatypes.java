package com.JavaBasics;

import java.util.Arrays;

public class ReferencesDatatypes {
    public static void main(String[] args){
        // string
        String first_name="Pavan";
        String last_name="Raaj";

        System.out.println(first_name+last_name);


        // Arrays
        String uSquare[]={"pavan","meenu","sugu","kasi","keerthana"};
        String trailBlazzers[]={"abisha","swetha","jeru","santhanu","aswath"};
        String tenDots[]={"prasanna","hasan","ismail","vimal","vs"};


        System.out.println(Arrays.toString(uSquare)+" "+Arrays.toString(trailBlazzers)+" "+Arrays.toString(tenDots));
    }
}
