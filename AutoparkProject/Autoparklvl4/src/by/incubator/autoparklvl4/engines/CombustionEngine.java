package by.incubator.autoparklvl4.engines;

public abstract class CombustionEngine extends AbstractEngine {

    double engineCapacity;
    double fuelTankCapacity;
    double fuelConsumptionPer100;

    public CombustionEngine(String typeOfEngine, double taxCoef, double engineCapacity, double fuelTankCapacity, double fuelConsumptionPer100) {
        super(typeOfEngine, taxCoef);
        this.engineCapacity = engineCapacity;
        this.fuelTankCapacity = fuelTankCapacity;
        this.fuelConsumptionPer100 = fuelConsumptionPer100;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(double fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public double getFuelConsumptionPer100() {
        return fuelConsumptionPer100;
    }

    public void setFuelConsumptionPer100(double fuelConsumptionPer100) {
        this.fuelConsumptionPer100 = fuelConsumptionPer100;
    }


    @Override
    public double getTaxPerMonth() {
        return super.taxCoef;
    }

    @Override
    public double getMaxKilometers() {
        return this.fuelTankCapacity*100/this.fuelConsumptionPer100;
    }

}
