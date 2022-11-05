package by.incubator.autoparklvl9.starter;


import by.incubator.autoparklvl9.VehicleCollection.VehicleCollection;
import by.incubator.autoparklvl9.exceptions.DetectedVehicleException;
import by.incubator.autoparklvl9.mechanicservice.MechanicService;
import by.incubator.autoparklvl9.vehicle.Vehicle;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

    final static String FILE_PATH_TO_VEHICLES = "C:\\UltimateIdeaProjects\\Autoparklvl5\\Autoparklvl6\\vehicles.csv";
    final static String FILE_PATH_TO_TYPES = "C:\\UltimateIdeaProjects\\Autoparklvl5\\Autoparklvl6\\types.csv";
    final static String FILE_PATH_TO_RENTS = "C:\\UltimateIdeaProjects\\Autoparklvl5\\Autoparklvl6\\rents.csv";
    final static String PATH_TO_FILE_WITH_ORDERS = "C:\\UltimateIdeaProjects\\Autoparklvl5\\Autoparklvl9\\orders.csv";

    public static void main(String[] args) throws FileNotFoundException, DetectedVehicleException {

        VehicleCollection vehicleCollection = new VehicleCollection(FILE_PATH_TO_VEHICLES,FILE_PATH_TO_TYPES,
                FILE_PATH_TO_RENTS);
        MechanicService mechanicService = new MechanicService();
        List<Vehicle> list = vehicleCollection.getVehicleList();
        for (Vehicle vehicle: list){
            mechanicService.detectBreaking(vehicle);
        }
        mechanicService.repair(list.get(3));
        mechanicService.repair(list.get(6));
        for (Vehicle vehicle: list){
            if(!mechanicService.isBroken(vehicle)){
                System.out.println(vehicle);
            }
        }

        rent(vehicleCollection.getVehicleList().get(3),mechanicService);
        //rent(vehicleCollection.getVehicleList().get(1),mechanicService);

        for (Vehicle vehicle: list){
            if(vehicle.getId()==searchTheMostBreikVehicle(mechanicService,list)){
                System.out.println(vehicle);
            }
        }


    }


    public static int searchTheMostBreikVehicle(MechanicService mechanicService,List<Vehicle> list) throws DetectedVehicleException {
        Map<Integer, Integer> map = new HashMap<>();//ключ - айди машины, значение - количество поломок
        List<String> breakings = mechanicService.readFromFile(PATH_TO_FILE_WITH_ORDERS);
        String[] forSplit;
        for (String temp : breakings) {
            forSplit = temp.split(",");
            map.put(Integer.parseInt(forSplit[0]), Integer.parseInt(forSplit[2]));
        }
        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        Integer maxValue = maxEntry.getValue();
        int idOfTheMostBreikVehicle = 0;
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (maxValue.equals(pair.getValue())) {
                idOfTheMostBreikVehicle = pair.getKey();
            }
        }
        return idOfTheMostBreikVehicle;
    }

    public static void rent(Vehicle vehicle, MechanicService mechanicService) throws DetectedVehicleException {
        if (mechanicService.isBroken(vehicle)) {
            throw new DetectedVehicleException();
        } else {
            System.out.println("Автомобиль успешно арендован");
        }
    }


}


