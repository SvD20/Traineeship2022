package by.incubator.task21;

public class Car implements Comparable<Car> {

    private String modelName;
    private int mileage;

    public Car() {
    }

    public Car(String modelName,int number) {
        this.modelName = modelName;
        this.mileage =number;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public int compareTo(Car anotherCar) {
        if(this.mileage == anotherCar.getMileage()){
            return 0;
        }
        else if(this.mileage < anotherCar.getMileage()){
            return -1;
        }
        else{
            return 1;
        }
    }

    @Override
    public String toString() {
        return   modelName + ' ' + mileage;
    }
}
