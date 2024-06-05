package com.vehicle.service.implementation;

import com.vehicle.service.Vehicle;
import com.vehicle.service.Car;
import com.vehicle.service.interaces.VehicleManagment;
import java.util.Date;

public class CarManagment implements VehicleManagment {

    public Vehicle createVehicle(Vehicle params) {
        Car param = (Car)params;

        if(param.getnWheel() == null){
            System.out.println(("numero ruote obbligatorio"));
            return null;
        }
        if(param.getnDoors() == null){
            System.out.println(("numero porte obbligatorio"));
            return null;
        }
        if(param.getLicencePlate() == null){
            System.out.println(("targa obbligatorio"));
            return null;
        }

        param.setManifacturingDate(new Date());
        return param;
    }
}
