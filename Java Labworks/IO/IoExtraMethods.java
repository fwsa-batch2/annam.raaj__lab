package com.JavaBasics;

import java.io.File;
import java.io.IOException;

public class IoExtraMethods {
    public static void main(String[] args) throws IOException {
        File fl = new File("PavanJava.txt");
        // Path
        System.out.println("Org_Path: "+fl.getPath());
        System.out.println("Ab_Path: "+fl.getAbsolutePath());

        //Mkdir
        File fl1 = new File("//home//annampavanraaj//Pavan");

        System.out.println(fl1.mkdir());
        System.out.println("Created");

        //list
        File fl2=new File("//home//annampavanraaj//technical2");
        fl2.list();
        for (String lists : fl2.list() ) {
            System.out.println(lists);
        }
    }
}
