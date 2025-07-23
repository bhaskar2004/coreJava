package mamals;

public class driver {
    public static void main(String[] args) {
        dog d=new dog();
        System.out.println("region: "+d.region);
        System.out.println("name: "+d.name);
        d.eat();
        d.sleep();
        d.bark();
    }
}
