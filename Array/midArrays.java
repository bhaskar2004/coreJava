package Array;

import java.util.Arrays;
import java.util.Scanner;

public class midArrays {

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

            int mid=(n/2)-1;
            for(int i=0;i<mid;i++) {
                int t=a[i];
                a[i]=a[mid];
                a[mid]=t;
                mid--;

            }
            System.out.println(Arrays.toString(a));
        }


}
