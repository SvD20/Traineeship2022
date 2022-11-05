package autoparklvl11.vehicle;

import autoparklvl11.engines.Startable;
import autoparklvl11.rent.Rent;
import autoparklvl11.utils.TechnicalSpecialist;

import java.util.List;
import java.util.Objects;

public class Vehicle implements Comparable<Vehicle> {

    private int id;
    private List<Rent> rents;
    private VehicleType type;
    private String modelName;
    private String registrationNumber;
    private int weight;
    private int manufactureYear;
    private int mileage;
    private Color color;
    private double tankVolume;
    private Startable engine;

    public Vehicle(int id,VehicleType type, String modelName, String registrationNumber, int weight,
                   int manufactureYear, int mileage, Color color, double tankVolume,Startable engine,List<Rent> rents) {
        this.id = id;
        this.type = type;
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.weight = weight;
        this.manufactureYear = manufactureYear;
        this.mileage = mileage;
        this.color = color;
        this.tankVolume = tankVolume;
        this.engine = engine;
        this.rents = rents;
    }

    public VehicleType getType() {
        return type;
    }

    public String getModelName() {
        return modelName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if(TechnicalSpecialist.validateRegistrationNumber(registrationNumber)){
            this.registrationNumber = registrationNumber;
        }
        else {
            System.out.println("Значение поля registrationnumber изменено на null из-за некорректного ввода");
            this.registrationNumber = null;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(TechnicalSpecialist.validateWeight(weight)){
            this.weight = weight;
        }
        else {
            System.out.println("Значение поля weight изменено не было, масса должна быть больше 0");
        }
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        if(TechnicalSpecialist.validateMileage(mileage)){
            this.mileage = mileage;
        }
        else {
            System.out.println("Значение поля mileage изменено не было из-за некорректного ввода");
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if(TechnicalSpecialist.validateColorString(color.toString())){
            this.color = color;
        }
        else {
            System.out.println("Значение поля color изменено не было из-за некорректного ввода");
        }
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }

    public double getCalcTaxPerMonth(){
        return (this.weight*0.0013) + (type.getTaxCoefficient()*engine.getTaxPerMonth()*30) + 5;
    }

    public Startable getEngine() {
        return engine;
    }

    public void setEngine(Startable engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return type.equals(vehicle.type) && modelName.equals(vehicle.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, modelName);
    }

    @Override
    public String toString() {
        return id + ", " + type.getTypeName() + ", "  + modelName + ", " + registrationNumber + ", " + weight + ", " +
                manufactureYear + ", " + mileage + ", " + color;
    }

    @Override
    public int compareTo(Vehicle anotherVehicle) {
        if(this.manufactureYear == anotherVehicle.manufactureYear){
            if(this.mileage == anotherVehicle.mileage){
                return 0;
            }
            else if(this.mileage < anotherVehicle.mileage){
                return -1;
            }
            else{
                return 1;
            }
        }
        else if(this.manufactureYear < anotherVehicle.manufactureYear){
            return -1;
        }
        else{
            return 1;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Rent> getRents() {
        return rents;
    }

    public void setRents(List<Rent> rents) {
        this.rents = rents;
    }

    public double getTotalIncome(){
        double totalIncome = 0;
        for(Rent rent: rents){
            totalIncome+=rent.getCost();
        }
        return totalIncome;
    }

    public double getTotalProfit(){
        double totalIncome = getTotalIncome();
        return totalIncome - getCalcTaxPerMonth();
    }


}
