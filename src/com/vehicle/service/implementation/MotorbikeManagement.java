package com.vehicle.service.implementation;

import com.vehicle.exeption.AcademyException;
import com.vehicle.service.Motorbike;
import com.vehicle.service.Vehicle;
import com.vehicle.service.interaces.VehicleManagement;

public class MotorbikeManagement implements VehicleManagement {

    @Override
    public Vehicle createVehicle(Vehicle params) throws AcademyException {
        Motorbike param = (Motorbike) params;

        if(param.getnWheel() == null){
            throw new AcademyException("numero ruote obbligatorio");
        }
        if(param.getLicencePlate() == null){
            throw new AcademyException("targa obbligatoria");
        }
        if(param.getCc() == null){
            throw new AcademyException("cilindrata obbligatoria");
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
