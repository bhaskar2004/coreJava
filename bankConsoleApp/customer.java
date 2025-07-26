package bankConsoleApp;
import java.time.LocalTime;
import java.util.*;
import java.time.LocalTime;

import static bankConsoleApp.customer.account;

public class customer extends atm{
    @Override
    public void display() {
        System.out.println("bank name :"+getBname());
        System.out.println("bank loc :"+getbLoc());
    }

    @Override
    public void debitacc(int dno) {
        System.out.println("debit acc no :"+dno);
    }

    @Override
    public void savingsacc(int bal) {
        System.out.println("savings acc balance :"+bal);
    }

    @Override
    void bankLocations() {
        String [] loc={"banglore","chikkabalapura","delhi","chennai","hydarabad"};
        for(int i=0 ;i<loc.length;i++){
            System.out.println(loc[i]);

        }

    }

    String cname="abc";
//   ArrayList<String>s1=new ArrayList<String>();
    @Override
    public void disatm() {
        System.out.println("ATM location is : "+getAtmLoc());
    }
    public static int account(String cusName, int password) {
        String[] customername = {"ram", "arjun"};
        int[] passwords = {1234, 4321};
        for (int i = 0; i < customername.length; i++) {
            if (cusName.equals(customername[i]) && password == passwords[i]) {
                return 1; // Access granted
            }
        }
        return 0; // Access denied
    }
}

class driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pin;
        int i = 0;
        int balance = 98500;
        int withdraw;
        int[] ar = {};
        LocalTime t = LocalTime.now();
        System.out.println("enter customer name and password ");
        System.out.println("enter the name");
        String cname = in.next();
        System.out.println("enter the password");
        int password = in.nextInt();
        int result = account(cname, password);
        if (result == 1) {
            System.out.println("Access granted");
            customer c=new customer();
                while (true) {
                    System.out.println();
                    System.out.println("Enter the choice ");
                    System.out.println("atm details - 2 , bank details - 3 , balance - 4 , add money-5 , debitAccDetails - 6 , withdrawAmt-7 ,bank locations -8,exit -0 ");
                    int choice = in.nextInt();
                    switch (choice) {
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

                            pin = in.nextInt();
                            if (pin == 1234) {
                                balance = balance + addmoney;
                                System.out.println("amount added successfully !!");
                                System.out.println("current balance is :" + balance);
                                System.out.println("time of transaction :" + t);
                            } else {
                                System.out.println("invalid pin try again later");
                            }
                            break;
                        case 6:
                            System.out.println("debit account details ");
                            c.debitacc(45876);
                            break;
                        case 7:
                            System.out.println("enter amt to be withdraw");
                            withdraw = in.nextInt();
                            System.out.println("enter the pin no : ");
                            pin = in.nextInt();
                            if (pin == 1234) {
                                balance = balance - withdraw;
                                System.out.println("amount withdrawn successfully !!");
                                System.out.println("current balance is :" + balance);
                                System.out.println("time of transaction :" + t);
                            } else {
                                System.out.println("invalid pin try again later ...");
                            }
                            break;
                        case 8:
                            c.bankLocations();
                            break;
                        case 0:
                            System.out.println(" thank you :) ");
                            return;
                        default:
                            System.out.println("invalid choice .... please try again !");
                    }
                }
            }else {
                System.out.println("invalid user or password");
            }
        }
    }
