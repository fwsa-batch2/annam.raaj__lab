package com.JavaBasics;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> States = new Stack<>();
        States.push("Andhra Pradesh");
        States.push("Telangana");
        States.push("Tamil Nadu");
        States.push("Karnataka");
        States.push("Kerala");
        States.push("Maharastra");
        System.out.println("States: "+States);
        System.out.println("Peek Value: "+ States.peek());
        States.pop();
        System.out.println("States After poping: "+States);
    }
}
