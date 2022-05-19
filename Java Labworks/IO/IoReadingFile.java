package com.JavaBasics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class IoReadingFile {
    public static void main(String[] args)  throws IOException {
        FileReader fl = new FileReader("/home//annampavanraaj//technical2//Pavan1.txt");
        BufferedReader buf = new BufferedReader(fl);

        Scanner scan=new Scanner(buf);
        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
    }
}
