package bankConsoleApp;

public class customer implements atm{
    @Override
    public void display() {
        System.out.println("bank name :"+bname);
        System.out.println("bank loc :"+bLoc);
        System.out.println("atm loc :"+atmLoc);

    }

    @Override
    public void debitacc(int dno) {
        System.out.println("debit acc no :"+dno);

    }

    @Override
    public void savingsacc(int bal) {
        System.out.println("savings acc balance :"+bal);

    }

    String cname="abc";

}
class driver{
    public static void main(String[] args) {
        customer c=new customer();
        System.out.println("customer name "+c.cname);
        c.display();
        c.debitacc(58769);
        c.savingsacc(98500);
    }
}
