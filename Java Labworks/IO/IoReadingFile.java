package com.JavaBasics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class IoReadingFile {
    public static void main(String[] args)  throws IOException {
        FileReader fl = new FileReader("/home//annampavanraaj//technical2//PavanJava.txt");

        Scanner scan=new Scanner(fl);
        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
    }
}
