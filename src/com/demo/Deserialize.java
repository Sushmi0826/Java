package com.demo;

import java.io.*;

public class Deserialize {
    public static void main(String args[]){
        try{
            //Creating stream to read the object
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:\\Data Engg\\myfirstproject\\src\\com\\demo\\Serializeout.txt"));
            Serializationdemo s=(Serializationdemo)in.readObject();
            //printing the data of the serialized object
            System.out.println(s.id+" "+s.name);
            //closing the stream
            in.close();
        }catch(Exception e){System.out.println(e);}
    }
}