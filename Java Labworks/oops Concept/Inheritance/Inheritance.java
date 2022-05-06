package com.JavaBasics;

// Single Inheritance
class father {
    void father(){
        System.out.println("I am father.");
    }
}
class children extends father{
    void son(){
        System.out.println("I am son.");
    }
    void daughter(){
        System.out.println("I am daughter");
    }
}

// Multi-level Inheritance
class human{
    void eat(){
        System.out.println("I can eat Veg and Non-Veg");
    }
    void sleep(){
        System.out.println("I will sleep at least 6 hours");
    }
}

class boy extends human{
    void walk(){
        System.out.println("I can walk more fast.");
    }
}
class pavan extends boy{
    void codingLevel(){
        System.out.println("I can code well");
    }
}

// Hierarchial Inheritance
class animal{
    void walk(){
        System.out.println("I walk with four legs");
    }
}
class tiger extends animal{
    void skinTone(){
        System.out.println("I have black strips");
    }
}
class fox extends animal{
    void eat(){
        System.out.println("I steel food.");
    }
        }


public class Inheritance {
    public static void main(String[] args) {
        //Single Inheritance
        children obj1 = new children();
        obj1.father();
        obj1.son();
        obj1.daughter();

        //Multi-level Inheritance
        pavan obj2 = new pavan();
        obj2.eat();
        obj2.walk();
        obj2.codingLevel();

     // Hierarchial Inheritance
        tiger obj3 = new tiger();
        obj3.skinTone();
        obj3.walk();

        fox obj4 = new fox();
        obj4.eat();
        obj4.walk();
    }
}
