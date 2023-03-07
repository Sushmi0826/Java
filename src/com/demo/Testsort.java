package com.demo;

import java.util.*;
import java.io.*;
class Studentinfo implements Comparable<Studentinfo>{
    int roll_no;
    String stu_name;
    int age;
    Studentinfo(int rollno,String name,int age){
        this.roll_no=rollno;
        this.stu_name=name;
        this.age=age;
    }
    public int compareTo(Studentinfo st){
        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;
    }
}
public class Testsort {
    public static void main(String args[]){
        ArrayList<Studentinfo> al=new ArrayList<Studentinfo>();
        al.add(new Studentinfo(101,"Vijay",23));
        al.add(new Studentinfo(106,"Ajay",27));
        al.add(new Studentinfo(105,"Jai",21));

        Collections.sort(al);
        for(Studentinfo st:al){
            System.out.println(st.roll_no+" "+st.stu_name+" "+st.age);
        }
    }
}
