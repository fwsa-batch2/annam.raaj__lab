package com.JavaBasics;

public class Average {
    public static void main(String[] args) {


//        int first_term=1 , second_term=5,third_term=7,fourth_term=8,fivth_term=3;
//
//      double  sum_of_terms= first_term+second_term+third_term+fourth_term+fivth_term;
//      System.out.println("Average of "+ first_term+" "+second_term+" "+third_term+" "+fourth_term+" "+fivth_term+" is "+ sum_of_terms / 5 );


        double sum = 0;
        double[] numbers = { 7, 6, 9, 5, 4 };
        for (double i : numbers) {
            sum = sum + i;
        }
        System.out.println("Average is : " + sum / numbers.length);
    }
}
