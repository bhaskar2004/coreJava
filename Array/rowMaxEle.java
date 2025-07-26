package Array;

import java.util.Arrays;

public class rowMaxEle {
    public static void main(String[] args) {


        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 15, 90}};


        for (int i = 0; i < a.length; i++) {
            int t = 0;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > t) {
                    t = a[i][j];
                }

            }System.out.println("row largest "+t);


        }

         for (int j = 0; j < a.length; j++) {
            int t = 0;
             {
                 for (int i = 0; i < a[j].length; i++)
                if (a[i][j] > t) {
                    t = a[i][j];
                }

            }System.out.println("col largest "+t);


        }

    }
}
