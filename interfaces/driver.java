package interfaces;
import java.util.Scanner;
class driverc1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter two numbers");
        int n1=in.nextInt();
        int n2=in.nextInt();
        System.out.println(" solutions");
        System.out.println("c1");
        cal1 c1=new cal1();
        c1.add(n1,n2);
        c1.sub(n1,n2);
        c1.mul(n1,n2);
        c1.div(n1,n2);

        System.out.println("");
        System.out.println("c2");
        cal2 c2=new cal2();
        c2.div(n1,n2);
        c2.mul(n1,n2);

        System.out.println("");
        System.out.println("c3");


    }
}
