package bankConsoleApp;

public abstract class atm extends bank{
    private String atmLoc="sjcit";

    public String getAtmLoc() {
        return atmLoc;
    }

    public void setAtmLoc(String atmLoc) {
        this.atmLoc = atmLoc;
    }

    abstract void disatm();
}
