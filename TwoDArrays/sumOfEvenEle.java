package TwoDArrays;

import java.util.Scanner;

public class sumOfEvenEle {
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
        double esum=0;
        double osum=0;
        int et=0;
        int ot=0;
        for(int i =0 ;i<r;i++){
            for(int j=0 ;j<c;j++){
                if(a[i][j]%2==0) {
                    esum += a[i][j];
                    et = et + 1;
                }
                else {
                    osum=osum+a[i][j];
                    ot+=1;
                }
            }

        }
        System.out.println("the sum of even ele is : "+esum+ "avg "+ (esum/et));
        System.out.println("the sum of odd ele "+osum+" the avg is "+(osum/ot));
    }

}
