package autoparklvl11.vehicleslistprocessing;

import autoparklvl11.vehicle.Vehicle;
import java.util.Comparator;
import java.util.List;

public class VehiclesProcessingImpl implements VehiclesProcessing{

    private final List<Vehicle> vehicleList;

    public VehiclesProcessingImpl(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }


    public void insert(int index, Vehicle v){
        if(vehicleList.get(index)==null){
            vehicleList.add(index,v);
        }
        else{
            vehicleList.add(v);
        }
    }

    public int delete(int index){
        if(vehicleList.get(index)==null){
            return -1;
        }
        else{
            vehicleList.remove(index);
            return index;
        }
    }

    public double sumTotalProfit(){
        double totalProfit = 0;
        for(Vehicle temp: vehicleList){
            totalProfit+=temp.getTotalProfit();
        }
        return totalProfit;
    }

    public void sort(Comparator<Vehicle> comparator){
        vehicleList.sort(comparator);
    }
}
