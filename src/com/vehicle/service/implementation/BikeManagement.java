package com.vehicle.service.implementation;

import com.vehicle.exeption.AcademyException;
import com.vehicle.service.Bike;
import com.vehicle.service.Vehicle;
import com.vehicle.service.interaces.VehicleManagement;

public class BikeManagement implements VehicleManagement {

    @Override
    public Vehicle createVehicle(Vehicle params) throws AcademyException {
        Bike param = (Bike) params;

        if(param.getnWheel() == null){
            throw new AcademyException("numero ruote obbligatorio");
        }
        if(param.getType() == null){
            throw new AcademyException("tipo bici obbligatorio");
        }
        if(param.getSuspension() == null){
            throw new AcademyException("tipo sospensione obbligatoria");
        }
        if(param.getBrand() == null){
            throw new AcademyException("brand obbligatorio");
        }
        if(param.getColor() == null){
            throw new AcademyException("colore obbligatorio");
        }
        if(param.getFuel() == null){
            throw new AcademyException("tipo alimentazione obbligatorio");
        }

        return null;
    }
}
