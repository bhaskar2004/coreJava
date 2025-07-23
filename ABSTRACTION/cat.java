package ABSTRACTION;

class cat extends animal{
    @Override
    void name(){
        System.out.println("tom");
    }

    @Override
    void sound() {
        System.out.println("meow...");
    }

//    @Override
//    void type() {
//        System.out.println("cat");
//    }

    public static void main(String[] args) {
        cat c= new cat();
        c.name();
        c.sound();
        c.type();
    }
}
