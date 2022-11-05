package by.incubator.task23.entitys;

public class Car {
    String modelName;

    public Car(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return  modelName;
    }
}
