package Array;

import java.util.Arrays;
import java.util.Scanner;

public class sortedArray {
    public static void sort(int []a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++) {
                if (a[j + 1] < a[j]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j+ 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
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
        sort(a);
    }

}
