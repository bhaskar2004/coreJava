package bankConsoleApp;

abstract class bank {
    private String bname="xyzz";

    private String bLoc="chikkaballapura";

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getbLoc() {
        return bLoc;
    }

    public void setbLoc(String bLoc) {
        this.bLoc = bLoc;
    }


    abstract void display();
    abstract void debitacc(int dno);
   abstract void savingsacc(int bal);
   abstract void bankLocations();


}
