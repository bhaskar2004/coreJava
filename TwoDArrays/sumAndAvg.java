package TwoDArrays;

import java.util.Scanner;

public class sumAndAvg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the row size and column size of array");
        int r= in.nextInt();
        int c= in.nextInt();
        int [][]a=new int[r][c];
        System.out.println("enter the elements of array ");
        for(int i =0 ;i<r;i++){
            for(int j=0 ;j<c;j++){
                a[i][j]=in.nextInt();
            }

        }
        double sum=0;
        int t=0;
        for(int i =0 ;i<r;i++){
            for(int j=0 ;j<c;j++){
                sum+=a[i][j];
                t=t+1;
            }

        }
        System.out.println("the average of ele is : "+ (sum/t));
    }
}
