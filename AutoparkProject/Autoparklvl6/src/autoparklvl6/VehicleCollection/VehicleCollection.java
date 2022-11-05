package autoparklvl6.VehicleCollection;

import autoparklvl6.engines.*;
import autoparklvl6.rent.Rent;
import autoparklvl6.vehicle.Color;
import autoparklvl6.vehicle.Vehicle;
import autoparklvl6.vehicle.VehicleType;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class VehicleCollection {

    private List<VehicleType> vehicleTypeList;
    private List<Vehicle> vehicleList;
    private List<Rent> rentsList;

    public VehicleCollection(String file_with_vehicles,
                             String file_with_types, String file_with_rents) throws IllegalArgumentException, FileNotFoundException {
    this.rentsList = loadRents(file_with_rents);
    this.vehicleTypeList = loadTypes(file_with_types);
    this.vehicleList = loadVehicles(file_with_vehicles);
    }

    List<VehicleType> loadTypes (String inFile) throws FileNotFoundException {
        List<VehicleType> vehicleTypeList = new ArrayList<>();
        File file = new File(inFile);
        try(
                FileInputStream fileInputStream = new FileInputStream(file);
                Scanner scanner = new Scanner(fileInputStream);
        ){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                vehicleTypeList.add(createType(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return vehicleTypeList;
    }

    VehicleType createType(String csvString){
        String [] types = csvString.split(",");
        return new VehicleType(Integer.parseInt(types[0]),types[1],Double.parseDouble(types[2]));
    }


    List<Rent> loadRents (String inFile) throws FileNotFoundException {
        List<Rent> rentList = new ArrayList<>();
        File file = new File(inFile);
        try(
                FileInputStream fileInputStream = new FileInputStream(file);
                Scanner scanner = new Scanner(fileInputStream);
        ){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String [] rents = line.split(",");
                rentList.add(new Rent(Integer.parseInt(rents[0]),rents[1],Double.parseDouble(rents[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rentList;
    }

    List<Vehicle> loadVehicles (String inFile) throws FileNotFoundException {
        List<Vehicle> vehicleList = new ArrayList<>();
        File file = new File(inFile);
        try(
                FileInputStream fileInputStream = new FileInputStream(file);
                Scanner scanner = new Scanner(fileInputStream);
        ){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                vehicleList.add(createVehicle(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return vehicleList;
    }

    Vehicle createVehicle(String csvString){
        String [] vehicles = csvString.split(",");
        Startable engine = createEngine(vehicles[8]);
        List<Rent> rents = new ArrayList<>();
        return new Vehicle(Integer.parseInt(vehicles[0]),vehicleTypeList.get(Integer.parseInt(vehicles[1])-1),
                vehicles[2],vehicles[3],Integer.parseInt(vehicles[4]),Integer.parseInt(vehicles[5]),
                Integer.parseInt(vehicles[6]), Color.valueOf(vehicles[7]),Double.parseDouble(vehicles[9]),engine,
                createStoryOfRents().get(Integer.parseInt(vehicles[0])-1));
    }

    List<List<Rent>> createStoryOfRents(){
        List<List<Rent>> lists_of_rents = new ArrayList<>();
        List<Rent> rents1 = new ArrayList<>();
        List<Rent> rents2 = new ArrayList<>();
        List<Rent> rents3 = new ArrayList<>();
        List<Rent> rents4 = new ArrayList<>();
        List<Rent> rents5 = new ArrayList<>();
        List<Rent> rents6 = new ArrayList<>();
        List<Rent> rents7 = new ArrayList<>();
      for(Rent rent:rentsList){
         switch (rent.getFk()){
             case 1:
                 rents1.add(rent);
                 break;
             case 2:
                 rents2.add(rent);
                 break;
             case 3:
                 rents3.add(rent);
                 break;
             case 4:
                 rents4.add(rent);
                 break;
             case 5:
                 rents5.add(rent);
                 break;
             case 6:
                 rents6.add(rent);
                 break;
             case 7:
                 rents7.add(rent);
                 break;
         }
      }
       lists_of_rents.add(rents1);
       lists_of_rents.add(rents2);
       lists_of_rents.add(rents3);
       lists_of_rents.add(rents4);
       lists_of_rents.add(rents5);
       lists_of_rents.add(rents6);
       lists_of_rents.add(rents7);
       return lists_of_rents;
    }

    Startable createEngine(String typeOfEngine){
        switch (Engine.valueOf(typeOfEngine)){
            case Diesel:
                return new DieselEngine(0,0,0);
            case Gasoline:
                return new GasolineEngine("Gasoline",1.3,0,0,0);
            case Electrical:
                return new ElectricalEngine(0,0);
            default:
                throw new IllegalStateException("Unexpected value: " + Engine.valueOf(typeOfEngine));
        }
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

    public void display(){
        System.out.println("Id   " + "Type   " + "ModelName   " + "Number   " + "Weight(kg)   " +
                "Year   " + "Mileage   " + "Color   " + "Income   " + "Tax   " + "Profit");
        for(int i=0; i<vehicleList.size();i++){
            System.out.print(vehicleList.get(i) + "   ");
            System.out.print(vehicleList.get(i).getTotalIncome() + "   ");
            System.out.print(vehicleList.get(i).getCalcTaxPerMonth() + "   ");
            System.out.println(vehicleList.get(i).getTotalProfit());
        }
        System.out.println("Total                                              " + sumTotalProfit());
    }

    public void sort(Comparator<Vehicle> comparator){
        vehicleList.sort(comparator);
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }
}
