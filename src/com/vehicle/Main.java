package com.vehicle;

import com.vehicle.service.Car;
import com.vehicle.service.Vehicle;
import com.vehicle.service.implementation.CarManagment;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<Vehicle> vehicles = new ArrayList<>();

        Car paramCar = new Car();
        paramCar.setnDoors(4);

        Car myCars = createCar(paramCar);
    }

    private static Car createCar(Car paramCar) {
        CarManagment cM = new CarManagment();
        Car myCar = (Car)cM.createVehicle(paramCar);
        if(myCar == null) {
            System.out.println("errore nella creazione della macchina");
        }

        return myCar;
    }
}