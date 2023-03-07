package com.demo;

public class Arithmetic {
        public int add(int a, int b) {
            return a + b;
        }
        public int sub(int a, int b){

            return a - b;
        }
        public int mul(int a , int b){

            return a * b;
        }
        public int div(int a, int b) {

            return a / b;
        }

        public static void main(String[] args) {
            Arithmetic art = new Arithmetic();
            System.out.println("Addition of 5, 10 is " + art.add(5,10));
            System.out.println("Subraction of 5, 10 is "+art.sub(5,10));
            System.out.println("Multiplication of 5,10 is "+art.mul(5,10));
            System.out.println("Division of 5,10 is "+art.div(15,10));
        }
    }

