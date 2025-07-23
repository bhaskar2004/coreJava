import java.util.*;
public class calculator {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public calculator(int a , int b) {
        this.a=a;
        this.b=b;
    }

    public int add(){
        return a+b;
    }
    public int sub(){
        return a-b;
    }
    public int mul(){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        calculator c = new calculator(1, 2);
        System.out.println("enter var1");
        c.setA(in.nextInt());
        System.out.println("enter var2");
        c.setB(in.nextInt());
        System.out.println("enter you choice 1 - add , 2- sub , 3- mul , 4- to exit");
        int choice = in.nextInt();

            switch (choice) {
                case 1:
                    int add1 = c.add();
                    System.out.println(add1);
                    break;
                case 2:
                    int sub1 = c.sub();
                    System.out.println(sub1);
                    break;
                case 3:
                    int mul1 = c.mul();
                    System.out.println(mul1);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("entered invalid input");
            }


    }

}
