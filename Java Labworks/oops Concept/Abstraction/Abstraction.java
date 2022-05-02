package com.JavaBasics;

abstract class animals{
    abstract void eat();
    abstract void sleep();
}

class dog extends animals{
    void eat(){
        System.out.println("I am carnivores");
    }
    void sleep(){
        System.out.println("I sleep 3 hrs a day");
    }

}

class lion extends dog{
    void communicate(){
        System.out.println("I Roar");
    }
}
public class Abstraction {
    public static void main(String[] args){
        lion my_obj = new lion();
        my_obj.eat();
    }
}
