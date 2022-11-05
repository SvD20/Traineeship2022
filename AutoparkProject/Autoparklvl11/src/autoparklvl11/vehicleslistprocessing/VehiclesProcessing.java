package autoparklvl11.vehicleslistprocessing;

import autoparklvl11.vehicle.Vehicle;
import java.util.Comparator;

public interface VehiclesProcessing {
    void insert(int index, Vehicle v);
    int delete(int index);
    double sumTotalProfit();
    void sort(Comparator<Vehicle> comparator);
}
