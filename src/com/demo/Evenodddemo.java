package com.demo;

public class Evenodddemo {
    public static void main(String[] args) {
        int num[] ={10, 15, 35, 20, 22, 36, 32, 41, 62, 70};
        System.out.println("Odd Numbers:");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                System.out.println(num[i]);
            }
        }

        System.out.println("Even Numbers:");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i]);
            }
        }

    }
}
