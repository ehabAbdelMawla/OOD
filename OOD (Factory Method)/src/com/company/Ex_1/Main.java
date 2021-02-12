package com.company.Ex_1;

public class Main {

    public static Person getPerson(String name, String gender){
            Person p = null;
            if (gender.equals("M"))
                p = new Male(name);
            else if (gender.equals("F"))
                p = new Female(name);
            return p;
        }
    public static void main(String[] args) {
        Person male=getPerson("Mohamed","M");
        Person female=getPerson("Mona","F");

    }
}