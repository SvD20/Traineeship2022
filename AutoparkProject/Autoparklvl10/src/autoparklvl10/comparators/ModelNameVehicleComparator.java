package autoparklvl10.comparators;

import autoparklvl10.vehicle.Vehicle;
import java.util.Comparator;

public class ModelNameVehicleComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle vehicle1, Vehicle vehicle2) {
        return vehicle1.getModelName().compareTo(vehicle2.getModelName());
    }
}