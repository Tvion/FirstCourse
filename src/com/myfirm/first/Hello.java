
/**
 * @version 1.0
 * @autor Alex Ivanov
 */


package com.myfirm.first;


import javafx.css.Size;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) throws IOException {
       /* double d= 0.0/0.0;
        int a,b=0;
        ArrayList<String> s=new ArrayList<>();
        System.out.println(Double.isNaN(d)?1:d);
        String ad=String.join("d",s);
        if() */

//    double doubl=335.345;
//    System.out.printf("%08.1f %08.1e",doubl,doubl);
        Scanner scanner = new Scanner(Paths.get("asd.txt"),"UTF-8");
        StringBuilder stringBuilder = new StringBuilder();
        while(scanner.hasNext()){
            stringBuilder.append(scanner.nextLine());
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder.toString());
        PrintWriter printWriter=new PrintWriter("asdx.txt","UTF-8");
        printWriter.print(stringBuilder.toString());
        printWriter.close();
    }

}

