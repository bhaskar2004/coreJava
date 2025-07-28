package Array;

import java.util.Scanner;

public class evenEleAvg {

    public static void eavg(double []a){
        int sum=0;
        int t=0;
        for(int i=0 ;i<a.length;i++){
            if(a[i]%2==0){
                sum+=a[i];
                t=t+1;
            }
        }
        System.out.println("the sum of even elements :" + sum);
        System.out.println("the average value of even elements is : "+(sum/t));

    }
    public static void oavg(double []a){
        int sum=0;
        int t=0;
        for(int i=0 ;i<a.length;i++){
            if(a[i]%2==1){
                sum+=a[i];
                t=t+1;
            }
        }
        System.out.println("the sum of odd elements :" + sum);
        System.out.println("the average value of odd elements is : "+(sum/t));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int n=in.nextInt();
        double [ ]a=new double[n];
        System.out.println("enter the elements of the array ");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        eavg(a);
        oavg(a);
    }
}
