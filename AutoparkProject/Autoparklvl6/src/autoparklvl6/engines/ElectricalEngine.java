package autoparklvl6.engines;

public class ElectricalEngine extends AbstractEngine {

    double butterySize;
    double electricityConsumption;

    public ElectricalEngine(double butterySize,double electricityConsumption) {
        super("Electrical", 0.1);
        this.butterySize = butterySize;
        this.electricityConsumption = electricityConsumption;
    }

    public double getButterySize() {
        return butterySize;
    }

    public double getElectricityConsumption() {
        return electricityConsumption;
    }

    public void setElectricityConsumption(double electricityConsumption) {
        this.electricityConsumption = electricityConsumption;
    }

    public void setButterySize(double butterySize) {
        this.butterySize = butterySize;
    }

    @Override
    public double getTaxPerMonth() {
        return super.taxCoef;
    }

    @Override
    public double getMaxKilometers() {
        return this.butterySize/this.electricityConsumption;
    }
}
