package autoparklvl8.starter;

import autoparklvl8.VehicleCollection.VehicleCollection;
import autoparklvl8.mystack.Stack;
import autoparklvl8.mystack.StackImpl;
import autoparklvl8.vehicle.Vehicle;
import java.io.FileNotFoundException;


public class Main {

    final static String FILE_PATH_TO_VEHICLES = "C:\\UltimateIdeaProjects\\Autoparklvl5\\Autoparklvl6\\vehicles.csv";
    final static String FILE_PATH_TO_TYPES = "C:\\UltimateIdeaProjects\\Autoparklvl5\\Autoparklvl6\\types.csv";
    final static String FILE_PATH_TO_RENTS = "C:\\UltimateIdeaProjects\\Autoparklvl5\\Autoparklvl6\\rents.csv";

    public static void main(String[] args) throws FileNotFoundException {

        VehicleCollection vehicleCollection = new VehicleCollection(FILE_PATH_TO_VEHICLES,FILE_PATH_TO_TYPES,
                FILE_PATH_TO_RENTS);
        Stack<Vehicle> garage = new StackImpl<>(10);
        System.out.println(garage.isEmpty());
        for(int i = 0; i<vehicleCollection.getVehicleList().size(); i++){
            garage.push(vehicleCollection.getVehicleList().get(i));
            System.out.println(vehicleCollection.getVehicleList().get(i).getId());
        }
        for (int i = 0; i<vehicleCollection.getVehicleList().size();i++){
            while (!garage.isEmpty()){
                System.out.println(garage.pop().getId());
            }
        }
        System.out.println(garage.isEmpty());
    }
}

