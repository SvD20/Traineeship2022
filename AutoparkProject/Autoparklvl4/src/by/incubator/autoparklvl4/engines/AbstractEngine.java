package by.incubator.autoparklvl4.engines;

public abstract class AbstractEngine implements Startable {
    String typeOfEngine;
    double taxCoef;

    public AbstractEngine(String typeOfEngine,double taxCoef) {
        this.typeOfEngine = typeOfEngine;
        this.taxCoef = taxCoef;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public double getTaxCoef() {
        return taxCoef;
    }

    public void setTaxCoef(double taxCoef) {
        this.taxCoef = taxCoef;
    }

    @Override
    public String toString() {
        return  typeOfEngine + ", " + taxCoef;

    }
}
