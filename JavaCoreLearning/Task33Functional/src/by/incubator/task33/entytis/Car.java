package by.incubator.task33.entytis;

public class Car implements Comparable<Car> {
    private String name;
    private int mileage;

    public Car(String name,int mileage) {
        this.name = name;
        this.mileage = mileage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public int compareTo(Car anotherCar) {
        if(this.mileage < anotherCar.getMileage()){
            return -1;
        }
        else {
            if(this.mileage > anotherCar.getMileage()){
            return 1;
            }
        return 0;
        }
    }

    @Override
    public String toString() {
        return  name  + "," + mileage;
    }
}
