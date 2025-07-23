public class ThisCall {
    String name;
    int id;
    double marks;
    String clg;

    ThisCall(){

    }
    ThisCall(String name){
        this.name=name;
    }
    ThisCall(String name,int id){
        this(name);
        this.id=id;
    }
    ThisCall(String name , int id ,double marks){
        this(name,id);
        this.marks=marks;
    }
    ThisCall(String name , int id ,double marks,String clg){
        this(name,id,marks);
        this.clg=clg;
    }
}
class Main{
    public static void main(String[] args) {
        ThisCall t=new ThisCall();
        ThisCall t1=new ThisCall("ram");
        ThisCall t2=new ThisCall("ram",123);
        ThisCall t3=new ThisCall("ram",123,22.4);
        ThisCall t4=new ThisCall("ram",123,22.4,"SJCIT");
        System.out.println(t1.name);
        System.out.println(t2.name +" "+ t2.id);
        System.out.println(t3.name +" "+ t3.id + "  "+ t3.marks);
        System.out.println(t4.name);

    }
}
