package constructorOverloading;

public class parent {
    static {
        System.out.println("parent is loaded");
    }
    static void parentLove(){
        System.out.println("parents love child");
    }
}
class child extends parent{
    static {
        System.out.println("child is loaded");
    }
    static void childLove(){
        System.out.println("child love parents");
    }
}
class dirver{
    public static void main(String[] args) {
//        parent p =new parent();
////          child c=new child();
//          parent.parentLove();
        System.out.println("");
        child.childLove();
//        c.childLove();
//        System.out.println("");
//        c.parentLove();

    }
}
