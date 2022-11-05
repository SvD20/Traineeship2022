package by.incubator;

import java.util.Objects;
import static java.lang.Math.*;

public class Vector {

    private char name;
    private double x;
    private double y;
    private double z;
    private double sum_of_squares;

    public Vector(char name,double x,double y, double z) {
        this.name = name;
        this.x = x;
        this.y=y;
        this.z=z;
        this.sum_of_squares =  pow(x,2)+pow(y,2)+pow(z,2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return Double.compare(vector.sum_of_squares, sum_of_squares) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sum_of_squares);
    }

    @Override
    public String toString() {
        return "Vector " +
                 name +
                " (" + x +
                ", " + y +
                ", " + z +
                "), " + "hashcode = " +
                hashCode();
    }
}
