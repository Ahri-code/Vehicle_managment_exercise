package com.vehicle.service;

import java.util.Date;

public class Vehicle {
    private Integer nWheel;
    private String typeVehicle;
    private String fuel;
    private String color;
    private String brand;
    private Date manifacturingDate;

    public Integer getnWheel() {
        return nWheel;
    }

    public void setnWheel(Integer nWheel) {
        this.nWheel = nWheel;
    }

    public String getTypeVehicle() {
        return typeVehicle;
    }

    public void setTypeVehicle(String typeVehicle) {
        this.typeVehicle = typeVehicle;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getManifacturingDate() {
        return manifacturingDate;
    }

    public void setManifacturingDate(Date manifacturingDate) {
        this.manifacturingDate = manifacturingDate;
    }
}
