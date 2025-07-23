package objectLoadingProcess;

public class father {
    String name="Father";
}
class ds extends father{
    String name="child";
    void display(){
        System.out.println(super.name);
        System.out.println(this.name);
    }
}
class d{
    public static void main(String[] args) {
        ds d=new ds();
        d.display();
        System.out.println("");
        String c=d.name;
        System.out.println(c);

    }
}