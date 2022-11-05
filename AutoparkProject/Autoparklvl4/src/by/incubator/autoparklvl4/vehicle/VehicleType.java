package by.incubator.autoparklvl4.vehicle;

public class VehicleType implements Comparable<VehicleType> {

    String typeName;
    double taxCoefficient;

    public VehicleType(){}

    public VehicleType(String typeName, double taxCoefficient) {
        this.typeName = typeName;
        this.taxCoefficient = taxCoefficient;
    }

    public double getTaxCoefficient() {
        return taxCoefficient;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setTaxCoefficient(double taxCoefficient) {
        this.taxCoefficient = taxCoefficient;
    }

    public void display(){
        System.out.println("typeName = " + this.typeName);
        System.out.println("taxCoefficient = " + this.taxCoefficient);
    }

    public String getString(){
        return typeName + ", " + taxCoefficient;
    }

    @Override
    public int compareTo(VehicleType anotherVehicleType) {
        if(this.taxCoefficient== anotherVehicleType.taxCoefficient){
            return 0;
        }
        else if(this.taxCoefficient < anotherVehicleType.taxCoefficient){
            return -1;
        }
        else{
            return 1;
        }
    }
}
