package autoparklvl10.engines;

public class GasolineEngine extends CombustionEngine {

    public GasolineEngine(String typeOfEngine, double taxCoef, double engineCapacity, double fuelTankCapacity,
                          double fuelConsumptionPer100) {
        super(typeOfEngine, taxCoef, engineCapacity, fuelTankCapacity, fuelConsumptionPer100);
    }

}
