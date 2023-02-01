package com.demo;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriterdemo {
    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("D:\\DatEngg\\myfirstproject\\src\\com\\demo\\writeoutput.txt");
            fw.write("we have to write in a file");
            fw.close();
            System.out.println("writting");
        } catch (FileNotFoundException fe ) {
            System.out.println("fileNotfoundexception: " + fe.getMessage());
        }catch (IOException ie) {
            System.out.println("IOexception: " + ie.getMessage());
        }


    }
}
