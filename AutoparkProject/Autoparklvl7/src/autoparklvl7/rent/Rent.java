package autoparklvl7.rent;

public class Rent {

    private int fk;
    private String date;
    private double cost;

    public Rent() {
    }

    public Rent(int fk,String date, double cost) {
        this.fk = fk;
        this.date = date;
        this.cost = cost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getFk() {
        return fk;
    }

    public void setFk(int fk) {
        this.fk = fk;
    }
}
