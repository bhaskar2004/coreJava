package bankConsoleApp;
import java.util.Scanner;
public class customer implements atm{
    @Override
    public void display() {
        System.out.println("bank name :"+bname);
        System.out.println("bank loc :"+bLoc);


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

    @Override
    public void disatm() {
        System.out.println("ATM location is : "+atmLoc);

    }
}
class driver{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pin;
        int balance = 98500;
        int withdraw;
        customer c=new customer();
        while (true) {
            System.out.println();
            System.out.println("Enter the choice ");
            System.out.println("customer details - 1 , atm details - 2 , bank details - 3 , balance - 4 , addmoney-5 , debitaccDetails - 6 , withdrawAmt-7 ,exit -0 ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("customer name " + c.cname);
                    System.out.println("U have account in ");
                    c.display();
                    break;
                case 2:
                    c.disatm();
                    break;
                case 3:
                    c.display();
                    break;
                case 4:
                    c.savingsacc(balance);

                    break;
                case 5:
                    System.out.println("enter the amt to be added ");
                    int addmoney = in.nextInt();
                    System.out.println("enter the pin no : ");
                    pin=in.nextInt();
                    if(pin==1234){
                        balance = balance + addmoney;
                        System.out.println("amount added successfully !!");
                        System.out.println("current balance is :" + balance);
                    }
                    else {
                        System.out.println("invalid pin try again later");
                    }
                    break;

                case 6:
                    System.out.println("debit account details ");
                    c.debitacc(45876);
                    break;
                case 7:
                    System.out.println("enter amt to be withdraw");
                    withdraw=in.nextInt();
                    System.out.println("enter the pin no : ");
                    pin=in.nextInt();
                    if(pin==1234){
                        balance = balance - withdraw;
                        System.out.println("amount withdrawn successfully !!");
                        System.out.println("current balance is :" + balance);
                    }
                    else {
                        System.out.println("invalid pin try again later ...");
                    }
                    break;
                    
                case 0:
                    System.out.println(" thank you :) ");
                    return;
                default:
                    System.out.println("invalid choice .... please try again !");

            }

        }
    }
}
