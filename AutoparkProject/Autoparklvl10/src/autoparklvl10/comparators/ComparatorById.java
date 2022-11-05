package autoparklvl10.comparators;

import autoparklvl10.vehicle.Vehicle;
import java.util.Comparator;

public class ComparatorById implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle vehicle1, Vehicle vehicle2) {
        if(vehicle1.getId() < vehicle2.getId()){
            return 1;
        }
        else {
            if(vehicle1.getId() > vehicle2.getId()){
                return -1;
            }
            return 0;
        }
    }
}
