package com.gfg.interfacedemo;

public class TataPunch extends TataCar{

    private Engine engine;

    // Default Constructor
    public TataPunch() {
        this.engine = new Engine("1200");
    }

    // Constructor Overloading
    public TataPunch(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String getPUC() {
        return null;
    }

    @Override
    public String getRC() {
        return "RC of Punch";
    }

    @Override
    public String getInsurance() {
        return null;
    }

    @Override
    public String getCarGPSLocation() {
        return null;
    }

    @Override
    public String getMusicSystem() {
        return "Punch Music System";
    }
}
