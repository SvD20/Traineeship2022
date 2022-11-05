package by.incubator.task24.entitys;

import java.util.Objects;

public class Car {
    public String modelName;

    public Car(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return modelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return modelName.equals(car.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName);
    }
}
