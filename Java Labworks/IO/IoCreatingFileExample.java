package com.JavaBasics;

import java.io.File;
import java.io.IOException;

public class IoCreatingFileExample {
    public static void main(String[] args) throws IOException {
        File file1 = new File("//home//annampavanraaj//technical2//Pavan3.txt");

        if (file1.createNewFile()){
            System.out.println("File Created.");
        }
        else{
            System.out.println("NOt Created.");
        }
    }
}
