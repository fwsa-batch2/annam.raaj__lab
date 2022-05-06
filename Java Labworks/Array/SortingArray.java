package com.JavaBasics;

public class SortingArray {
    public static void main(String[] args){
        int array1[] = {1,3,4,2};
        System.out.print("The Sorted Array is : ");
        for (int i=0;i<array1.length;i++){
            for (int j=i+1;j<array1.length;j++){
                int temp = 0;
                if (array1[i] > array1[j]){
                    temp = array1[i];
                    array1[i]=array1[j];
                    array1[j]= temp;
                }
            }
            if (i != array1.length-1){
                System.out.print(array1[i]+",");

            }
            else{
                System.out.print(array1[i]);
            }
        }

    }
}
