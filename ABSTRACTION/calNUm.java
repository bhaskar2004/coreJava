package ABSTRACTION;
import java.util.Scanner;
public class calNUm extends calculator{
    @Override
    int add(int a, int b) {
        return a+b;
    }

    @Override
    int sub(int a, int b) {
        return a-b;
    }

    @Override
    int mul(int a, int b) {
        return a*b;
    }

    @Override
    int div(int a, int b) {
        return a/b;
    }
}
class DriverCal{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        calNUm c = new calNUm();
        System.out.println("welcome to calculator");
        while (true) {
        System.out.println("enter first numbers");
        int num1 = in.nextInt();
        System.out.println("enter second number");
        int num2 = in.nextInt();

            System.out.println("enter the choice add-1 , sub-2, mul-3 ,div-4 , exit -5");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(c.add(num1, num2));
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println(c.sub(num1, num2));
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println(c.mul(num1, num2));
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println(c.div(num1, num2));
                    System.out.println(" ");
                    break;
                case 5:
                    return;
            }

        }
    }
}
