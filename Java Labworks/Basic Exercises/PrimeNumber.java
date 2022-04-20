package com.JavaBasics;

public class PrimeNumber {
    public static void main(String[] args){
        int m=0,check=0;
        int n=24;
        m=n/2;
        if(n<=0||n==1){
            System.out.println(n+" is not prime number or composite number");
        }else{
            for(int i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is Composite number");
                    check=1;
                    break;

                }
            }
            if(check==0)
            { System.out.println(n+" is prime number"); }
        }
    }
}
