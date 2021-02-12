package com.company.EX_2;

public class NonLuxuryCar implements Car {
    private String name;

    public NonLuxuryCar(String carName) {
        name = carName;
    }

    public String getCarName() {
        return name;
    }

    public String getCarFeatures() {
        return "Non-LuxuryCar Car Features ";
    }
}
