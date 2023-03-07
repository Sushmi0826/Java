package com.demo;

import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo {
    public static void main(String[] args) {
        try {
            List arrList = new ArrayList<String>();
            arrList.add("deiva");
            arrList.add("sushu");
            arrList.add("kaviye");
            arrList.add("achu");
            arrList.add("kavin");
            arrList.add("raj");
            arrList.add("xyz");
            List secarrList=new ArrayList();
            secarrList.addAll(arrList);
            System.out.println(arrList);
            System.out.println(arrList.size());
            System.out.println((arrList.contains("raj")) ? "true" : "false");
            arrList.remove("xyz");
            System.out.println(arrList.size());
            System.out.println("Demonstrating:"+arrList.isEmpty());
            arrList.clear();
            System.out.println("post clearing the array list:"+arrList.size());
            System.out.println(secarrList);
            System.out.println((arrList.contains("raj")) ? "true" : "false");
            System.out.println(arrList.get(8));
            System.out.println((arrList.contains("xyz")) ? "true" : "false");
        }
        catch(Exception e){
            System.out.println("Exception :"+e.getMessage());
        }
    }
}
