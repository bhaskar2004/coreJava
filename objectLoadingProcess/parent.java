package objectLoadingProcess;

public class parent {
    {
        System.out.println("parent is loaded");
    }
    void pamper(){
        System.out.println("parent pamper child");
    }
}
class child extends parent{
    {
        System.out.println("child is loaded");
    }
    void respect(){
        System.out.println("child respects parent");
    }
}
class Driver{
    public static void main(String[] args) {
        parent p = new parent();
        p.pamper();
//        p.respect();
        System.out.println(" ");
        child c=new child();
        c.respect();
        System.out.println(" ");
        c.pamper();
    }
}