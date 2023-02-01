package com.demo;


import java.io.FileInputStream;
import java.io.BufferedInputStream;


public class bufferinputdemo {
    public static void main(String args[]){
        try{
            FileInputStream fin=new FileInputStream("D:\\Data Engg\\myfirstproject\\src\\com\\demo\\testoutput.txt");
            BufferedInputStream bin=new BufferedInputStream(fin);
            int i;
            while((i=bin.read())!=-1){
                System.out.print((char)i);
            }
            bin.close();
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
