package Array;

import java.util.Arrays;
import java.util.Scanner;

public class duplicate {
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

        Arrays.sort(a);
        int []b=new int[a.length];
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                b[i]=a[i];
                b[i+1]=a[i+1];
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
