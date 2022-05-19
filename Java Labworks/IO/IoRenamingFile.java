package com.JavaBasics;

import java.io.File;
import java.io.IOException;

public class IoRenamingFile {
    public static void main(String[] args) throws IOException {
        File fl = new File("/home//annampavanraaj//technical2//Pavan1.txt");
        File fl1 = new File("/home//annampavanraaj//technical2//PavanJava.txt");
        fl.renameTo(fl1);
        System.out.println("Program Done.");
    }
}
