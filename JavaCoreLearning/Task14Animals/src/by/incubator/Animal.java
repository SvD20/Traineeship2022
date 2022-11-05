package by.incubator;

public class Animal implements Voiceable,Moveable,Starveable {

    String name;
    int footNumber;
    boolean hasMustache;

    public Animal() {
    }

    public Animal(String name, int footNumber, boolean hasMustache) {
        this.name = name;
        this.footNumber = footNumber;
        this.hasMustache = hasMustache;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFootNumber() {
        return footNumber;
    }

    public void setFootNumber(int footNumber) {
        this.footNumber = footNumber;
    }

    public boolean isHasMustache() {
        return hasMustache;
    }

    public void setHasMustache(boolean hasMustache) {
        this.hasMustache = hasMustache;
    }
}
