package Array;
import java.util.Scanner;
public class two_dArrayAddition {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][]a={{1,2,3},{4,5,6},{7,8,9}};
        int [][]b={{1,2,3},{4,5,6},{7,8,9}};
        int [][]c=new int[3][3];
        //sorting

        for(int i =0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                c[i][j]=a[i][j]+b[i][j];

            }
        }
        for(int i =0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                System.out.println(c[i][j]);

            }
        }



    }
}
