package com.JavaBasics;

import java.io.FileWriter;
import java.io.IOException;

public class IoWritingInFile {
    public static void main(String[] args) throws IOException {
        FileWriter file_write = new FileWriter("//home//annampavanraaj//technical2//PavanJava.txt");

        // .write will replace the content and put the new content
        file_write.write("Hi... I am Pavan.I am from FWSA.Now I will tell about Java:" +
                "\nJava was developed in 1991 and it is therefore considered a new programming language. The first Java version was meant for use in programming home " +
                "appliances that operated with the use of computer processors. In 1994, it was discovered that Java was ideal for use on web browsers. Soon, Java started " +
                "being connected with the internet. The first Netscape browser was released by Netscape and it would run Java programs.\n" +
                "\n" +
                "Originally, this programming was named Oak. However, another language already existed by that name and therefore it was renamed Java. Today, " +
                "many people consider it a language of the internet. However, this language can be used in other applications that are not related to internet.\n" +
                "\n" +
                "Portability Aspect of Java\n" +
                "\n" +
                "One of the main reasons why this language is considered portable is the fact that it is architecture-neutral. More importantly, this language differs " +
                "from C and C++, both of which are “implementation dependent”. This means that primitive data types as well as their sizes are already specified. The same " +
                "case applies to the arithmetic behaviors embedded on them. If you take “int”, for example, its meaning is always the same: assigned two’s complement of " +
                "32-bit integer. “Float” always means a floating number 32-bit IEEE 754. Joshua argues that one can make these choices, which are an integral element of " +
                "all CPUs in use today (150).\n" +
                "\n" +
                "This language is also considered in terms of the relevant libraries present in different operating systems. A good example is the presence of Window " +
                "class that is abstract in terms of implementations in Unix, Macintosh and Windows NT/95. The Java system is also portable since its runtime is in ANSI C, " +
                "a highly portable element.\n" +
                "\n" +
                "Five Elements of Java Programming Language\n" +
                "\n" +
                "Keywords constitute one of the five elements of Java. They have a special meaning and they cannot be used outside the scope of this meaning. They are " +
                "also referred to as reserve words. Examples are “public” and “class”.");
        file_write.write("Hiiii....");

        // Append will cont. the passage

        file_write.append("Hello");

        file_write.close();
        System.out.println("File is Written");
    }
}
