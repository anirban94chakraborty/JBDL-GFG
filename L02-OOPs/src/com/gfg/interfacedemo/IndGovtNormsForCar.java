package com.gfg.interfacedemo;

public interface IndGovtNormsForCar {

    String getRC();

    String getInsurance();

    String getCompanyName();

    default String getCarGPSLocation() {
        return "Not Available";
    }
}
