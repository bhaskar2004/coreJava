package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.println("enter the elements of the array ");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        //sorting
        for (int i = 0; i < n; i++) {
            int currentele = a[i];
            int j=i-1;
            while(j>=0 && a[j]>currentele){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=currentele;

        }
        System.out.println(Arrays.toString(a));
    }
}
