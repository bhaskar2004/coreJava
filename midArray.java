import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class midArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array");
        int n =in.nextInt();
        int[] a = new int[n];
        System.out.println("enter the elements of array");
        //input
        for (int i=0 ;i<n;i++){
            a[i]=in.nextInt();
        }
        int m=a.length/2;
        int []b=new int[m];

        for(int i=0;i<a.length/2;i++){
            b[m-i-1]=a[i];
        }
        System.out.println("first half");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        for(int i=m;i<a.length;i++){
            System.out.println(a[i]);
        }
        //second half
        System.out.println("second half");
        int mid=a.length;
        for(int i=a.length/2;i<a.length;i++){
            b[mid-i-1]=a[i];
        }
        for(int i=0;i<mid/2;i++){
            System.out.println(a[i]);
        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
