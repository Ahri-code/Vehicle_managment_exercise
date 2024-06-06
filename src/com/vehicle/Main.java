package com.vehicle;

import com.vehicle.exeption.AcademyException;
import com.vehicle.service.Bike;
import com.vehicle.service.Car;
import com.vehicle.service.Motorbike;
import com.vehicle.service.Vehicle;
import com.vehicle.service.implementation.BikeManagement;
import com.vehicle.service.implementation.CarManagement;
import com.vehicle.service.implementation.MotorbikeManagement;
import com.vehicle.singletone.MySingleTone;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MySingleTone.getInstance();

//      List creation

        List<Vehicle> vehicles = new ArrayList<>();

        Car paramCar = new Car();
        paramCar.setnDoors(5);
        paramCar.setCc(1900);
        paramCar.setnWheel(4);
        paramCar.setLicencePlate("AX829BC");
        paramCar.setBrand("Toyota");
        paramCar.setColor("Red");
        paramCar.setFuel("Gas");

        vehicles.add(paramCar);

        Car paramCar2 = new Car();
        paramCar2.setnDoors(3);
        paramCar2.setCc(900);
        paramCar2.setnWheel(3);
        paramCar2.setBrand("Reliant");
        paramCar2.setColor("Green");
        paramCar2.setFuel("Gas");

        vehicles.add(paramCar2);

        Motorbike paramMotorbike = new Motorbike();
        paramMotorbike.setCc(500);
        paramMotorbike.setnWheel(2);
        paramMotorbike.setLicencePlate("CL819BF");
        paramMotorbike.setBrand("Honda");
        paramMotorbike.setColor("Blue");
        paramMotorbike.setFuel("Gas");

        vehicles.add(paramMotorbike);

        Bike paramBike = new Bike();
        paramBike.setnWheel(2);
        paramBike.setBrand("KTM");
        paramBike.setColor("Orange");

        vehicles.add(paramBike);

//      For creation

        for(Vehicle vehicle : vehicles) {
            if(vehicle instanceof Car) {
                Car car = (Car) vehicle;
                Car myCar = createCar(car);
            } else if (vehicle instanceof Motorbike) {
                Motorbike motorbike = (Motorbike) vehicle;
                Vehicle myMotorbike = createMotorbike(motorbike);
            } else if (vehicle instanceof Bike) {
                Bike bike = (Bike) vehicle;
                Vehicle myBike = createBike(bike);
            }
        }

    }

    private static Car createCar(Car paramCar) {
        CarManagement cM = new CarManagement();
        Car myCar = null;
        try {
            myCar = (Car)cM.createVehicle(paramCar);
        } catch (AcademyException e) {
            System.out.println("Error: " + e.getMessage());
        }// finally {
//          finally viene sempre eseguito
//            System.out.println("Finally");
//        }
        return myCar;
    }

    private static Motorbike createMotorbike(Motorbike paramMotorbike) {
        MotorbikeManagement mM = new MotorbikeManagement();
        Motorbike myMotorbike = null;
        try {
            myMotorbike = (Motorbike)mM.createVehicle(paramMotorbike);
        } catch (AcademyException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return myMotorbike;
    }

    private static Bike createBike(Bike paramBike) {
        BikeManagement bM = new BikeManagement();
        Bike myBike = null;
        try {
            myBike = (Bike)bM.createVehicle(paramBike);
        } catch (AcademyException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return myBike;
    }
}