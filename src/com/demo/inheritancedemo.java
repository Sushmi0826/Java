package com.demo;

public class inheritancedemo {
    float salary = 50000;
}
class salary extends inheritancedemo {
    int bonus = 30000;
    public static void main(String[]args){
        salary s = new salary();
        System.out.println("salary of person: "+ s. salary );
        System.out.println("bonus of person: " + s.bonus);

    }


}
