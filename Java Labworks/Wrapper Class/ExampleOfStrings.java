package com.JavaBasics;

public class ExampleOfStrings {
    public static void main(String[] args) {
        //String

        //Concat
        String mystr = "hello";
        System.out.println(mystr.concat(" world"));
        //Equals
        String str1="Hello";
        System.out.println(str1.equals("hello"));
        //split
        String str2 = "hello world";
        String[] myList = str2.split(" ");
        for (String a : myList)
            System.out.println(a);
        //Length
        String str3 = "Pavan";
        System.out.println(str3.length());
        //SubString
        String str4 = "PavanRaaj";
        System.out.println(str4.substring(0,5));

        //StringBuffer

        //Append or Concat
        StringBuffer newStr = new StringBuffer("Pavan");
        System.out.println(newStr.append(" Raaj"));
        //insert
        StringBuffer newStr1 = new StringBuffer("Raa");
        System.out.println(newStr1.insert(3, "j"));
        //replace
        StringBuffer newStr2 = new StringBuffer("Sing");
        System.out.println(newStr2.replace(0, 2, "So"));
        //Delete
        StringBuffer newStr3 = new StringBuffer("PavanRaaj");
        System.out.println(newStr3.delete(4, 8));
        //reverse
        StringBuffer newStr4 = new StringBuffer("Pavan");
        System.out.println(newStr4.reverse());
        //Capacity
        StringBuffer newStr5 = new StringBuffer();
        System.out.println("Default Capacity :" +newStr5.capacity());
        newStr5.append("String Buffer is easy to understand");
        System.out.println("Lenght :" +newStr5.length());
        System.out.println("  Default Capacity :" +newStr5.capacity());

      //StringBuilder
        //CC :Same methods in StringBuffer...
    }
}

