package com.demo;

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class bufferoutputdemo {
    public static void main(String args[])throws Exception{
        FileOutputStream fout=new FileOutputStream("D:\\Data Engg\\myfirstproject\\src\\com\\demo\\writeoutput.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="Welcome to Nexturn";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }

}
