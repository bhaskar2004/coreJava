package interfaces;

public interface demo {
     void display();
}
class driver implements demo{

    @Override
    public void display() {
        System.out.println("hi how are you ");

    }

    public static void main(String[] args) {
        demo d= new driver();
        driver b=(driver)d;
        b.display();
    }
}
