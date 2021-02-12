package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Shape sh;
        ArrayList<String> lst = new ArrayList<>();
        lst.add("Shape");
        lst.add("Circle");
        lst.add("Rectangle");
        for (String s : lst) {
            if (s.equals("Shape")) {
                sh = new Shape();
            } else if (s .equals("Circle")) {
                sh = new Circle(10);
            } else {
                sh = new Rectangle(10,10);
            }
            sh.Area();

        }
    }
}
