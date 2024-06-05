package com.vehicle;

import com.vehicle.exeption.AcademyException;
import com.vehicle.service.Bike;
import com.vehicle.service.Car;
import com.vehicle.service.Motorbike;
import com.vehicle.service.implementation.BikeManagement;
import com.vehicle.service.implementation.CarManagement;
import com.vehicle.service.implementation.MotorbikeManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//      CREAZIONE LISTA

//      Auto

        List<Car> cars = new ArrayList<>();

        Car paramCar = new Car();
        paramCar.setnDoors(5);
        paramCar.setCc(1900);
        paramCar.setnWheel(4);
        paramCar.setLicencePlate("AX829BC");
        paramCar.setBrand("Toyota");
        paramCar.setColor("Red");
        paramCar.setFuel("Gas");

        cars.add(paramCar);

        Car paramCar2 = new Car();
        paramCar2.setnDoors(3);
        paramCar2.setCc(900);
        paramCar2.setnWheel(3);
        paramCar2.setBrand("Reliant");
        paramCar2.setColor("Green");
        paramCar2.setFuel("Gas");

        cars.add(paramCar2);

//      Moto

        List<Motorbike> motorbikes = new ArrayList<>();

        Motorbike paramMotorbike = new Motorbike();
        paramMotorbike.setCc(500);
        paramMotorbike.setnWheel(2);
        paramMotorbike.setLicencePlate("CL819BF");
        paramMotorbike.setBrand("Honda");
        paramMotorbike.setColor("Blue");
        paramMotorbike.setFuel("Gas");

        motorbikes.add(paramMotorbike);

//      Bici

        List<Bike> bikes = new ArrayList<>();

        Bike paramBike = new Bike();
        paramBike.setnWheel(2);
        paramBike.setBrand("KTM");
        paramBike.setColor("Orange");

        bikes.add(paramBike);

//      FOR

//      Auto

        for(Car car : cars) {
            Car myCar = createCar(car);
            if(myCar != null) {
                System.out.println("***************\nMarca: " + myCar.getBrand() + "\nNumero porte: " + myCar.getnDoors() + "\nNumero ruote: "+ myCar.getnWheel() + "\nCilindrata: " + myCar.getCc() + "\nColore:  "+ myCar.getColor() + "\nTarga: "+ myCar.getLicencePlate() + "\n***************");
            }
        }

//      Moto

        for(Motorbike motorbike : motorbikes) {
            Motorbike myMotorbike = createMotorbike(motorbike);
            if(myMotorbike != null) {
                System.out.println("***************\nMarca: " + myMotorbike.getBrand() + "\nNumero ruote: "+ myMotorbike.getnWheel() + "\nCilindrata: " + myMotorbike.getCc() + "\nColore:  "+ myMotorbike.getColor() + "\nTarga: "+ myMotorbike.getLicencePlate() + "\n***************");
            }
        }

//       Bici

        for(Bike bike : bikes) {
            Bike myBike = createBike(bike);
            if(myBike != null) {
                System.out.println("***************\nMarca: " + myBike.getBrand() + "\nNumero ruote: "+ myBike.getnWheel() + "\nSospensioni: " + myBike.getSuspension() + "\nColore:  "+ myBike.getColor() + "\nTipologia: "+ myBike.getType() + "\nPieghevole: "+ myBike.isFoldable() + "\n***************");
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