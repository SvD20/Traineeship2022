package autoparklvl6.starter;

import autoparklvl6.VehicleCollection.VehicleCollection;
import autoparklvl6.comparators.ModelNameVehicleComparator;
import java.io.FileNotFoundException;


public class Main {

    final static String FILE_PATH_TO_VEHICLES = "C:\\UltimateIdeaProjects\\Autoparklvl5\\Autoparklvl6\\vehicles.csv";
    final static String FILE_PATH_TO_TYPES = "C:\\UltimateIdeaProjects\\Autoparklvl5\\Autoparklvl6\\types.csv";
    final static String FILE_PATH_TO_RENTS = "C:\\UltimateIdeaProjects\\Autoparklvl5\\Autoparklvl6\\rents.csv";

    public static void main(String[] args) throws FileNotFoundException {

        VehicleCollection vehicleCollection = new VehicleCollection(FILE_PATH_TO_VEHICLES,FILE_PATH_TO_TYPES,
                FILE_PATH_TO_RENTS);
        vehicleCollection.display();
        vehicleCollection.getVehicleList().add(vehicleCollection.getVehicleList().get(6));
        vehicleCollection.delete(1);
        vehicleCollection.delete(4);
        vehicleCollection.display();
        vehicleCollection.sort(new ModelNameVehicleComparator());
        vehicleCollection.display();

    }
}

