package com.gfg.interfacedemo;

public abstract class TataCar implements IndGovtNormsForCar, IndEnvNorms {

    @Override
    public String getCompanyName() {
        return "Tata";
    }
}
