package by.incubator.autoparklvl4.vehicle;

import by.incubator.autoparklvl4.utils.TechnicalSpecialist;
import by.incubator.autoparklvl4.engines.Startable;

import java.util.Objects;

public class Vehicle implements Comparable<Vehicle> {

    private final VehicleType type;
    private final String modelName;
    private String registrationNumber;
    private int weight;
    private final int manufactureYear;
    private int mileage;
    private Color color;
    private int tankVolume;
    private Startable engine;

    public Vehicle(VehicleType type, String modelName, String registrationNumber, int weight,
                   int manufactureYear, int mileage, Color color, int tankVolume,Startable engine) {
        if(TechnicalSpecialist.validateVehicleType(type.getString())){
            this.type = type;
        }
        else {
            System.out.println("Поле type инициализировано  значением null из-за некорректного ввода");
            this.type = null;
        }
        if(TechnicalSpecialist.validateModelName(modelName)){
            this.modelName = modelName;
        }
        else {
            System.out.println("Поле modelname инициализировано значением null из-за некорректного ввода");
            this.modelName = null;
        }
        if(TechnicalSpecialist.validateRegistrationNumber(registrationNumber)){
            this.registrationNumber = registrationNumber;
        }
        else {
            System.out.println("Поле registrationnumber инициализировано значением null из-за некорректного ввода");
            this.registrationNumber = null;
        }
        if(TechnicalSpecialist.validateWeight(weight)){
            this.weight = weight;
        }
        else {
            System.out.println("Поле weight инициализировано значением 0 из-за некорректного ввода");
            this.weight = 0;
        }
        if(TechnicalSpecialist.validateManufactureYear(manufactureYear)){
            this.manufactureYear = manufactureYear;
        }
        else {
            System.out.println("Поле manufactureyear инициализировано значением 0 из-за некорректного ввода");
            this.manufactureYear = 0;
        }
        if(TechnicalSpecialist.validateMileage(mileage)){
            this.mileage = mileage;
        }
        else {
            System.out.println("Поле mileage инициализировано значением 0 из-за некорректного ввода");
            this.mileage = 0;
        }
        if(TechnicalSpecialist.validateColorString(color.toString())){
            this.color = color;
        }
        else {
            System.out.println("Поле color инициализировано значением null из-за некорректного ввода");
            this.color = null;
        }
        this.tankVolume = tankVolume;
        this.engine = engine;
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

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
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
        return type.getTypeName() + ", " + type.getTaxCoefficient() + ", " + modelName + ", " + registrationNumber + ", " + weight + ", " +
                manufactureYear + ", " + mileage + ", " + color + ", " + tankVolume + ", " + getCalcTaxPerMonth()
                + ", " + engine.toString();
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
}
