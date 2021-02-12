package com.company;

public class Circle implements Shape{
    public double radius;

    public Circle(double radius){
        this.radius= radius;
    }
    public double calculateArea()
    {
        return (22/7)*radius*radius;
    }
}
