import java.util.Scanner;
public class student {
    private String name;
    private float sub1,sub2;

    public float getSub1() {
        return sub1;
    }

    public void setSub1(float sub1) {
        this.sub1 = sub1;
    }

    public float getSub2() {
        return sub2;
    }

    public void setSub2(float sub2) {
        this.sub2 = sub2;
    }

    public float average(){
        return (sub1+sub2)/2;
    }
    student(String name , float sub1,float sub2){
        this.name=name;
        this.sub1=sub1;
        this.sub2=sub2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        student s1=new student("ram",40 ,50);
        System.out.println("enter the marks of sub 1");
        s1.setSub1(in.nextFloat());
        System.out.println("enter the marks of sub 2");
        s1.setSub2(in.nextFloat());
        float a=s1.average();
        System.out.println("average marks is ="+a);
    }

}
