package com.company;


public class Circle extends Shape{
    public double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public void Area() {

        System.out.println("Area of Circle = "+((22/7.0)*Math.pow(radius,2)));
    }
}
