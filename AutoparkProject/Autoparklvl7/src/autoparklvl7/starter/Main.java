package autoparklvl7.starter;

import autoparklvl7.VehicleCollection.VehicleCollection;
import autoparklvl7.myqueue.MyQueue;
import autoparklvl7.myqueue.MyQueueImpl;
import autoparklvl7.vehicle.Vehicle;
import java.io.FileNotFoundException;


public class Main {

    final static String FILE_PATH_TO_VEHICLES = "C:\\UltimateIdeaProjects\\Autoparklvl5\\Autoparklvl6\\vehicles.csv";
    final static String FILE_PATH_TO_TYPES = "C:\\UltimateIdeaProjects\\Autoparklvl5\\Autoparklvl6\\types.csv";
    final static String FILE_PATH_TO_RENTS = "C:\\UltimateIdeaProjects\\Autoparklvl5\\Autoparklvl6\\rents.csv";

    public static void main(String[] args) throws FileNotFoundException {

        VehicleCollection vehicleCollection = new VehicleCollection(FILE_PATH_TO_VEHICLES,FILE_PATH_TO_TYPES,
                FILE_PATH_TO_RENTS);
        MyQueue<Vehicle> myQueue = new MyQueueImpl<>(8);
        for(int i = 0; i<vehicleCollection.getVehicleList().size(); i++){
            myQueue.add(vehicleCollection.getVehicleList().get(i));
        }
        for (int i = 0; i<vehicleCollection.getVehicleList().size() ;i++){
            System.out.println(myQueue.remove().getId());
        }
        System.out.println(myQueue.isEmpty());
    }
}

