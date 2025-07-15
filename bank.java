public class bank{
    private long accNo;
    private int pin;
    public long getAcc(){
        return accNo;
    }
    public void seytAcc(long accNo){
        this.accNo=accNo;
    }
    public bank(long accNo , int pin){
        this.accNo=accNo;
        this.pin = pin;
    }

    public static void main (String args[]){
        bank b = new bank(12345,123);

        System.out.println(b.accNo);
    }
}