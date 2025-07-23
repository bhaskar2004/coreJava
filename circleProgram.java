import java.util.*;
public class circleProgram {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    circleProgram(double radius){
        this.radius=radius;
    }

    public double area(){
        return (22.0/7.0)*radius*radius;
    }
    public double circum(){
        return 2*(22.0/7.0)*radius;
    }

    public double diameter(){
        return 2*radius;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        circleProgram c1=new circleProgram(6);
        System.out.println("enter the radius");
        c1.setRadius(in.nextDouble());
        double are=c1.area();
        double cir1= c1.circum();
        double dia = c1.diameter();
        System.out.println("circumference="+cir1+" "+"area="+are+" "+"diameter="+dia);
    }
}
