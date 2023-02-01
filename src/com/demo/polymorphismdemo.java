package com.demo;
interface Drawable{
    void draw();
}
class Rectangle implements Drawable{
    public void draw(){System.out.println("drawing rectangle");}
}
class Circle implements Drawable{
    public void draw(){System.out.println("drawing circle");}
}
class polymorphismdemo {
    public static void main(String []args){
        Drawable d = new Circle();
        d.draw();
        Drawable d1 = new Rectangle();
        d1.draw();
    }
}
