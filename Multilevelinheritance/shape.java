package Multilevelinheritance;

public class shape {
    String shape="shape is loaded";
}
class circle extends shape{
    String circle_name="round";
}
class semicircle extends circle{
    String semi_circle="semiCircle";
}
class Main{
    public static void main(String[] args) {

        semicircle sc=new semicircle();
        System.out.println("sub child");
        System.out.println(sc.semi_circle);
        System.out.println(sc.circle_name);
        System.out.println(sc.shape);


        System.out.println(" ");
        circle c= new circle();
        System.out.println("child");
        System.out.println(c.circle_name);
        System.out.println(c.shape);


        System.out.println(" ");
        shape s= new shape();
        System.out.println("parent");
        System.out.println(s.shape);
    }
}
