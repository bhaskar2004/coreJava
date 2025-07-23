package constructorOverloading;

public class class1 {
    String name,address;
    int age;
    char gender;
    boolean no;
    class1(String name,String address){
        this.name=name;
        this.address=address;
    }
    class1(int age){
        this.age=age;
    }
    class1(char gender){
        this.gender=gender;
    }
    class1(boolean no){
        this.no=no;
    }

    public static void main(String[] args) {
        class1 c=new class1("bhaskar","gbd");
        class1 c1=new class1(21);
        class1 c2=new class1('m');
        class1 c3=new class1(true);
        System.out.println(c3.no+"    the output of c3");

    }
}
