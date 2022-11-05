package autoparklvl6.comparators;

import autoparklvl6.vehicle.Vehicle;

import java.util.Comparator;

public class ModelNameVehicleComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle vehicle1, Vehicle vehicle2) {
        return vehicle1.getModelName().compareTo(vehicle2.getModelName());
    }
}