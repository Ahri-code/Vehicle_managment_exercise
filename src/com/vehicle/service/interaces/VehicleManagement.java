package com.vehicle.service.interaces;

import com.vehicle.exeption.AcademyException;
import com.vehicle.service.Vehicle;

public interface VehicleManagement {

    Vehicle createVehicle(Vehicle params) throws AcademyException;
}
