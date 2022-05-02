package com.JavaBasics;

class firstClass{
    void test() {
        System.out.println("This is 1st");
    }
}
class secondClass extends firstClass{
    void test() {
        System.out.println("This is 2nd");
    }
}
public class ExampleOfOverRidding {

        public static void main(String[] args) {
            secondClass myObj = new secondClass();
            myObj.test();
        }
    }



