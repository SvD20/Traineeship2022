package by.incubator.autoparklvl9.vehicle;

public class VehicleType implements Comparable<VehicleType> {

    int id;
    String typeName;
    double taxCoefficient;

    public VehicleType(){}

    public VehicleType(int id,String typeName, double taxCoefficient) {
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
