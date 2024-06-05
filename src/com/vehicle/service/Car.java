package com.vehicle.service;

public class Car extends Vehicle{
    private String licencePlate;
    private Integer nDoors;
    private Integer cc;

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public Integer getnDoors() {
        return nDoors;
    }

    public void setnDoors(Integer nDoors) {
        this.nDoors = nDoors;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }
}
