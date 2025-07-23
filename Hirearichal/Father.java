package Hirearichal;

public class Father {
    String name="ram";
}
class son extends Father{
    String name="lava";
    void display(){
        System.out.println(super.name);
        System.out.println(this.name);
    }
}
class daughter extends Father{
    String name="kushi";
    void display(){
        System.out.println(super.name);
        System.out.println(this.name);
    }
}
class Main{
    public static void main(String[] args) {
        son s=new son();
        System.out.println("son class");
        s.display();

        System.out.println(" ");

        daughter d= new daughter();
        System.out.println("daughter class");
        d.display();
    }
}