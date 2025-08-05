package Array;

import java.util.Scanner;

public class searching {
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
        System.out.println("enter the key");
    int key=in.nextInt();
    for(int i=0;i<a.length;i++){
        if(key==a[i]){
            System.out.println("ele found at index  "+ (i));
        }

    }

    }
}
