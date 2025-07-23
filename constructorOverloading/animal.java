package constructorOverloading;

public class animal {
    animal(){
        System.out.println("i am a animal");
    }
    animal(String name){
        System.out.println("animal name is: "+name);
    }
}
class cat extends animal{
    cat(){
        super();
        System.out.println("cat constructor");
    }
    cat(String name){
        super(name);
        System.out.println("name of cat :"+name);
    }
}
class Main{
    public static void main(String[] args) {
        cat c=new cat();
        System.out.println(" ");
        cat c1=new cat("tom");
    }
}
