package com.company.EX_2;

public class LuxuryCar  implements Car {
    private String name;

    public LuxuryCar(String carName) {
        name = carName;
    }

    public String getCarName() {
        return name;
    }

    public String getCarFeatures() {
        return "Luxury Car Features ";
    }
}
