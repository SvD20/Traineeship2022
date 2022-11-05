package by.incubator;

import java.util.Objects;

public class Vehicle implements Comparable<Vehicle> {

    private VehicleType type;
    private String modelName;
    private String registrationNumber;
    private int weight;
    private int manufactureYear;
    private int mileage;
    private Color color;
    private int tankVolume;

    public Vehicle() {
    }

    public Vehicle(VehicleType type,String modelName,String registrationNumber,int weight,
                   int manufactureYear, int mileage, Color color, int tankVolume) {
        this.type = type;
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.weight = weight;
        this.manufactureYear = manufactureYear;
        this.mileage = mileage;
        this.color = color;
        this.tankVolume = tankVolume;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public double getCalcTaxPerMonth(){
        return (this.weight*0.0013) + (type.getTaxCoefficient()*30) + 5;
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
                manufactureYear + ", " + mileage + ", " + color + ", " + tankVolume + ", " + getCalcTaxPerMonth();
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
