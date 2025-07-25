package Array;
import java.util.Arrays;
import java.util.Scanner;
public class two_dArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][]a=new int[3][3];
        for(int i =0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=in.nextInt();
            }
        }
        //sorting
        Arrays.sort(a);

        for(int i =0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.println(a[i][j]);
            }
        }

    }
}
