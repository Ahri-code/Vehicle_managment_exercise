package com.vehicle.singletone;

import com.vehicle.service.Vehicle;

import java.util.List;

public class MySingleTone {

    private static MySingleTone instance = null;

    private int id = 0;

    private List<Vehicle> vehicles;

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public static MySingleTone getInstance() {
        if(instance == null) {
            instance = new MySingleTone();
        }
        return instance;
    }

    public boolean removeItem(Integer id) {
        boolean rc = false;
        for (Vehicle it : listV) {
            if(it.getId() == id) {
                listV.remove(it);
                rc = true;
                break;
            }
        }
        if(rc) {
            System.out.println("Oggetto rimosso");
        }
        return rc;
    }

    public int getId() {
        id++;
        return id;
    }

    public void updateList(Vehicle obj) {

    }
}
