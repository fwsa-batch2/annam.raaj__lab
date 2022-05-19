package com.JavaBasics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IoWritingInFileBuffered {
    public static void main(String[] args) throws IOException {
        FileWriter wrt = new FileWriter("/home//annampavanraaj//technical2//Pavan1.txt");
        BufferedWriter buffer_Writing = new BufferedWriter(wrt);
        buffer_Writing.append("Hi.. Hello");
        buffer_Writing.close();
        System.out.println("File is written");
    }
}
