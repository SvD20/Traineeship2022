package autoparklvl11.comparators;

import autoparklvl11.vehicle.Vehicle;

import java.util.Comparator;

public class ComparatorByTaxPerMonth implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle vehicle1, Vehicle vehicle2) {
        if(vehicle1.getCalcTaxPerMonth() < vehicle2.getCalcTaxPerMonth()){
            return -1;
        }
        else{
            if(vehicle1.getCalcTaxPerMonth() > vehicle2.getCalcTaxPerMonth()){
                return 1;
            }
            return 0;
        }
    }
}
