package com.company;

public class Main {

    public static void main(String[] args) {
        Shape rect=new Rectangle(10,20);
        Shape cir=new Circle(15);
        AreaCalculator areaCalc=new AreaCalculator();

        System.out.println(rect.calculateArea());
        System.out.println(areaCalc.calculateShapeArea(rect));

        System.out.println(cir.calculateArea());
        System.out.println(areaCalc.calculateShapeArea(cir));
    }
}
