import java.util.*;
public class avrageMarksArray {
    private int[] a;

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }
    public avrageMarksArray(int[] a){
        this.a=a;
        return;
    }

    public float avg(){
        int sum=0;

       for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        return sum;
    }
    public int high(){
        int temp=a[0];
        for(int i=0 ;i<a.length;i++){
            if(temp>a[i]){
                return temp;
            }
            else{
                temp=a[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=in.nextInt();
        int[] a=new int[n];

        System.out.println("enter array elemets");
        for(int i=0 ;i<n ; i++){
            a[i]=in.nextInt();
        }
        avrageMarksArray s2=new avrageMarksArray(a);
        int h1=s2.high();
        float res=s2.avg();
        System.out.println(res);
        System.out.println("the average is ="+(res/n));
        System.out.println("the higest marks is: "+h1);
    }
}
