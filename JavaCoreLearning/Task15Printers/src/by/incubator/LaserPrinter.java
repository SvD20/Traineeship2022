package by.incubator;

public class LaserPrinter extends Printer{

    private String stamp;

    public LaserPrinter(String printerType, boolean scanFunction) {
        super(printerType, scanFunction);
    }


    @Override
    public void print() {
        System.out.println(stamp);
    }

    @Override
    public void scan() {
        if (this.scanFunction) {
            System.out.println("The scan is complete");
        } else {
            System.out.println("The scan is impossible");
        }
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp;
    }
}
