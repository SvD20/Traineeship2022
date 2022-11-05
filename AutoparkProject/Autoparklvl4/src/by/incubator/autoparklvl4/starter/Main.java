package by.incubator.autoparklvl4.starter;

import by.incubator.autoparklvl4.engines.DieselEngine;
import by.incubator.autoparklvl4.engines.ElectricalEngine;
import by.incubator.autoparklvl4.engines.GasolineEngine;
import by.incubator.autoparklvl4.vehicle.Color;
import by.incubator.autoparklvl4.vehicle.Vehicle;
import by.incubator.autoparklvl4.vehicle.VehicleType;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        VehicleType[] types = new VehicleType[4];
        types[0] = new VehicleType("Bus", 1.2);
        types[1] = new VehicleType("Car", 1.0);
        types[2] = new VehicleType("Rink", 1.5);
        types[3] = new VehicleType("Tractor", 1.2);

        Vehicle[] vehicles = new Vehicle[7];
        vehicles[0] = new Vehicle(types[0],"Volkswagen Crafter","5427 AX-7",2022,
                2015,376000, Color.Blue,6,
                new GasolineEngine("Gasoline",1.3,2,8.1,75));
        vehicles[1] = new Vehicle(types[0],"Volkswagen Crafter","6427 AA-7",2500,
                2014,227010,Color.White,7,
                new GasolineEngine("Gasoline",1.3,2.18,8.5,75));
        vehicles[2] = new Vehicle(types[0],"Electric Bus E321","6785 BA-7",12080,
                2019,20451,Color.Green,20,
                new ElectricalEngine(50,150));
        vehicles[3] = new Vehicle(types[1],"Golf 5","8682 AX-7",1200,
                2006,230541,Color.Gray,5,
                new DieselEngine(1.6,7.2,55));
        vehicles[4] = new Vehicle(types[1],"Tesla Model S 70D","0001 AA-7",1200,
                2019,10454,Color.White,10,
                new ElectricalEngine(25,70));
        vehicles[5] = new Vehicle(types[2],"Humm HD 12 VV",null,3000,
                2016,122,Color.Yellow,15,
                new DieselEngine(3.2,25,20));
        vehicles[6] = new Vehicle(types[3],"МТЗ Беларус-1025.4","1145 AB-7",1200,
                2020,109,Color.Red,12,
                new DieselEngine(4.75,20.1,135));

        Outputer outputer = new Outputer(vehicles);
        outputer.vehiclesOutput();
        System.out.println("THE SAME");
        Set<Vehicle> duplicates = new HashSet<>();
        for (int i = 0; i < vehicles.length; i++) {
            for (int j = 1; j < vehicles.length; j++) {
                if (vehicles[i].equals(vehicles[j]) && i != j) {
                    System.out.println(vehicles[j]);
                    duplicates.add(vehicles[i]);
                    break;
                }
            }
        }
        for (Vehicle temp: duplicates){
            System.out.println(temp);
        }
        System.out.println("The car that will travel the longest distance");
        Arrays.sort(vehicles);
        System.out.println(vehicles[vehicles.length-1]);
    }

    public static class Outputer{

        private Vehicle[] vehicles;

        public Outputer(Vehicle[] vehicles) {
            this.vehicles = vehicles;
        }

        public void vehiclesOutput(){
            for (Vehicle vehicle: this.vehicles){
                System.out.println(vehicle);
            }
        }
    }

    public static class EngineComparator implements Comparator<Vehicle> {

        @Override
        public int compare(Vehicle vehicle1, Vehicle vehicle2) {
            if (vehicle1.getEngine().getMaxKilometers() == vehicle2.getEngine().getMaxKilometers()) {
                return 0;
            } else if (vehicle1.getEngine().getMaxKilometers() < vehicle2.getEngine().getMaxKilometers()) {
                return -1;
            } else {
                return 1;
            }
        }


    }

}


/* LEVEL 1 VehicleType[] types = new VehicleType[4];
        types[0] = new VehicleType("Bus", 1.2);
        types[1] = new VehicleType("Car", 1.0);
        types[2] = new VehicleType("Rink", 1.5);
        types[3] = new VehicleType("Tractor", 1.2);
        for (VehicleType vehicleType:types){
            vehicleType.display();
        }
        types[3].setTaxCoefficient(1.3);
        Arrays.sort(types);
        System.out.println("max coef = " + types[3].getTaxCoefficient());
        double temp = 0.0;
        for (int i = 0; i< types.length; i++){
           temp +=  types[i].getTaxCoefficient();
        }
        System.out.println("average coef = " + temp/types.length);*/