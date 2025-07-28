package Array;
import java.util.*;
public class avgOfEle {

    public static void avg(double[]a ){
        double sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("the average of ele is :"+ (sum/a.length));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int n=in.nextInt();
        double [ ]a=new double[n];
        System.out.println("enter the elements of the array ");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        avg(a);
    }
}
