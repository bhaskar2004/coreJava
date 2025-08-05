package Array;

import java.util.Scanner;

public class revesre {
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
        int []b=new int[a.length];
        for(int i=0;i<a.length;i++) {
            b[a.length-i-1] = a[i];
        }
        System.out.println("reverse of array");
        for(int i=0;i<a.length;i++) {
            System.out.println(b[i]);
        }

        //even ele
        System.out.println("reverse of even elements");
        for(int i=0;i<b.length;i++){
                        if(b[i]%2==0) {
                System.out.println(b[i]);
                            }
        }
        //odd ele
        System.out.println("reverse of odd ele");
        for(int i=0;i<b.length;i++){
            if(b[i]%2==1) {
                System.out.println(b[i]);
                            }
        }

        //even index
        System.out.println("reverse of even index");
        for(int i=0;i<b.length;i++){
            if(i%2==0) {
                System.out.println(b[i]);

            }
        }
        //odd index
        System.out.println("reverse of odd index");
        for(int i=0;i<b.length;i++){
            if(i
                    %2==1) {
                System.out.println(b[i]);
            }
        }
    }
}
