package by.incubator;

public class Belavia implements Comparable<Belavia> {

    private String flightDestination = null;
    private int numberAircraft = 0;
    private String type = null;

    public Belavia(String flightDestination,int numberAircraft,String type){
        this.flightDestination = flightDestination;
        this.numberAircraft = numberAircraft;
        this.type = type;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    public int getNumberAircraft() {
        return numberAircraft;
    }

    public String getType() {
        return type;
    }

    @Override
    public int compareTo(Belavia anotherBelavia) {
        if(this.numberAircraft == anotherBelavia.numberAircraft ){
            return 0;
        }
        else if(this.numberAircraft < anotherBelavia.numberAircraft){
            return -1;
        }
        else{
            return 1;
        }
    }
}
