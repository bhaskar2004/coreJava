package sorting;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.println("enter the elements of the array ");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("enter the element to search ");
        int key = in.nextInt();
        int mid = a.length / 2;
        if (key < a[mid]) {
            for (int i = 0; i < mid; i++) {
                if (a[i] == key) {
                    System.out.println("key found " + a[i] + " at index " + (i + 1));
                }

            }

        } else {
            for (int i = mid; i < a.length; i++) {
                if (a[i] == key) {
                    System.out.println("key found " + a[i] + " at index " + (i + 1));
                }
            }

        }


    }

}