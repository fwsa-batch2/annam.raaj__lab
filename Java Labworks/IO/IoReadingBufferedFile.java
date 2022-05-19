package com.JavaBasics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IoReadingBufferedFile {
    public static void main(String[] args) throws IOException {
        FileReader fl = new FileReader("/home//annampavanraaj//technical2//PavanJava.txt");
        BufferedReader buf = new BufferedReader(fl);

        Scanner scan=new Scanner(buf);
        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }

    }
}
