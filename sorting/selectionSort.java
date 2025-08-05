/// /// ascending oreder
//package sorting;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class selectionSort {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter the size of the array ");
//        int n=in.nextInt();
//        int  [ ]a=new int[n];
//        System.out.println("enter the elements of the array ");
//        for(int i=0;i<n;i++){
//            a[i]=in.nextInt();
//        }
//        //sorting
//        for(int i=0;i<n-1;i++){
//            int minindex=i;
//            for(int j=i+1;j<n;j++){
//                // search the samllest ele in the remaining array
//                 if(a[j]<a[minindex]){
//                     minindex=j;
//                }
//
//            }
//            //compare with the i th index value with the minimum value found in the remaining array
//            int temp=a[minindex];
//            a[minindex]=a[i];
//            a[i]=temp;
//
//        }
//        System.out.println(Arrays.toString(a));
//
//    }
//}


/// /// descending order

package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int n=in.nextInt();
        int  [ ]a=new int[n];
        System.out.println("enter the elements of the array ");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        //sorting
        for(int i=0;i<n-1;i++){
            int minindex=i;
            for(int j=i+1;j<n;j++){
                // search the largest ele in the remaining array
                if(a[j]>a[minindex]){
                    minindex=j;
                }

            }
            //compare with the i th index value with the largest  value found in the remaining array
            int temp=a[minindex];
            a[minindex]=a[i];
            a[i]=temp;

        }
        System.out.println(Arrays.toString(a));

    }
}

