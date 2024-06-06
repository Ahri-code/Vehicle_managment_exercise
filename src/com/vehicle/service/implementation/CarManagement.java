package com.vehicle.service.implementation;

import com.vehicle.exeption.AcademyException;
import com.vehicle.service.Vehicle;
import com.vehicle.service.Car;
import com.vehicle.service.interaces.VehicleManagement;
import com.vehicle.singletone.MySingleTone;

import java.util.Date;

public class CarManagement implements VehicleManagement {

    @Override
    public Vehicle createVehicle(Vehicle params) throws AcademyException{
        Car param = (Car)params;

        if(param.getnWheel() == null){
            throw new AcademyException("numero ruote obbligatorio");
        }
        if(param.getnDoors() == null){
            throw new AcademyException("numero porte obbligatorio");
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

        param.setManifacturingDate(new Date());
        return param;
    }

    public void removeVehicle(Integer id) throws AcademyException {
        if(!MySingleTone.getInstance().removeItem(id)) {
            throw new AcademyException("Id non trovato");
        }
    }
}
