package com.JavaBasics;

public class DuplicateArrays {
    public static void main(String[] args){

        int array1[]={1,2,3,4,1,4,8};
        for (int i=0;i<array1.length-1;i++){
            for (int j=i+1;j<array1.length;j++){
                if (array1[i] == array1[j] ){
                    System.out.println("Duplicate value is " +array1[j]);
                }
                else {
                    System.out.println("There are no duplicate values");
                }
            }
        }

    }
}
