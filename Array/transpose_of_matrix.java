package Array;

import java.util.Scanner;

public class transpose_of_matrix {
    public static void main(String[] args) {

        int[][]a={{1,2,3},{4,5,6},{7,8,9}};
        int [][]c=new int[3][3];
        //sorting

        for(int i =0;i<a.length;i++) {
            for (int j = 0; j < a.length; j++) {
                 c[j][i] =a[i][j];
            }
            System.out.println();

        }
        for(int i =0;i<a.length;i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();

        }

    }
}
