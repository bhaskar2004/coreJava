package project;
import java.util.*;

public class driver {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the numbers");
        int num1=in.nextInt();
        int num2=in.nextInt();
        System.out.println("enter the choice");
        System.out.println("1 - c1 , 2-c2 , 3-c3 , 4 to exit");
        int choice= in.nextInt();
        calculator1 c1=new calculator1();
        calculator2 c2=new calculator2();
        claculator3 c3=new claculator3();

        switch (choice) {
            case 1:
                System.out.println("calculator1");

                c1.add(num1,num2);
                c1.sub(num1,num2);
                c1.mul(num1,num2);
                c1.div(num1,num2);

                System.out.println(" ");

                break;
            case 2:
                System.out.println("calculator2");

                c2.add(num1,num2);
                c2.sub(num1,num2);

                System.out.println(" ");
                break;
            case 3:
                System.out.println("calculator3");
                c3.cube(num1);
                c3.square(num1);
                c3.add(num1,num2);
                c3.sub(num1,num2);

                System.out.println(" ");
                break;

            case 4:
                return;
        }
    }


}
