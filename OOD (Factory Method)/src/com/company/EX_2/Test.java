package com.company.EX_2;

public class Test {
    public static void main(String[] args) {
        String vhCategory=VehicleFactory.LUXURY_VEHICLE , vhType="Non-Luxury",searchResult="";
        //get one of Luxury or NonLuxury vehicle factories
        VehicleFactory vf = VehicleFactory.getVehicleFactory(vhCategory);

        if (vhType.equalsIgnoreCase("Luxury")) {
            Car c = vf.getCar();
            searchResult = "Name: " + c.getCarName() + " Features: " +
                    c.getCarFeatures();
        }
        else if (vhType.equalsIgnoreCase("Non-Luxury")) {
            SUV s = vf.getSUV();
            searchResult ="Name: " + s.getSUVName() + " Features: " +
                    s.getSUVFeatures();
        }
        System.out.println(searchResult);
    }
}
