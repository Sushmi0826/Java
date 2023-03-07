package com.demo;

class Enumdemodeclare {
    enum EnumdemodeclareSize { SMALL, MEDIUM, LARGE }
    EnumdemodeclareSize size;
}

public class Enumdemo {

    public static void main(String args[]) {
        Enumdemodeclare Enumdemo = new Enumdemodeclare();
        Enumdemo.size = Enumdemodeclare.EnumdemodeclareSize.MEDIUM ;
        System.out.println("Size: " + Enumdemo.size);
    }
}
