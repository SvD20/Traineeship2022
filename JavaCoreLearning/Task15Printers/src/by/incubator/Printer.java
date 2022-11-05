package by.incubator;

public abstract class Printer implements IPrinter {

    String printerType;
    boolean scanFunction;

    public Printer(String printerType,boolean scanFunction) {
        this.printerType = printerType;
        this.scanFunction = scanFunction;
    }

    public String getPrinterType() {
        return printerType;
    }

    public void setPrinterType(String printerType) {
        this.printerType = printerType;
    }

    public boolean isScanFunction() {
        return scanFunction;
    }

    public void setScanFunction(boolean scanFunction) {
        this.scanFunction = scanFunction;
    }
}
