package Array;

import java.util.Scanner;

public class rankofMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the row size and column size of array");
        int r = in.nextInt();
        int c = in.nextInt();
        int[][] a = new int[r][c];
        System.out.println("enter the elements of array ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = in.nextInt();
            }

        }
    }
}
