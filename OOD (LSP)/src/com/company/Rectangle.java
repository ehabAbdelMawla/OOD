package com.company;

public class Rectangle extends Shape{
    public double length;
    public double width;

    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    @Override
    public void Area() {
        System.out.println("Area of Rectangle = "+(length*width));
    }
}
