package com.demo;

class Animal{
    public void eat(){
        System.out.println("Animals need food");
    }
    public void sleep(){
        System.out.println("Animals need sleep");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("Dog is eating");
    }
}
class Lion extends Animal{
    public void eat(){
        System.out.println("Lion is eating");
    }
}
public class TestPoly {
    public static void main(String[] args){
        Animal an=new Animal();
        an.eat();
        Dog dg=new Dog();
        dg.eat();
        dg.sleep();
        Lion ln=new Lion();
        ln.eat();
        ln.sleep();
    }
}
