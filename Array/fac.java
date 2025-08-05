package Array;

import java.util.Scanner;

public class fac {
    public static int fac(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n*fac(n-1);
        }
    }
    public static int sum(int n){
      while (n>=10){
          int sum=0;
          while (n>0){
              sum+=n%10;
              n/=10;
          }
          n=sum;
      }


        return n;
    }

    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int fact=fac(num);
        System.out.println("factroial "+ fact);
        int s=sum(fact);
        System.out.println("sum of factorial "+s);
        int difference=s-num;


            System.out.println(num +" + "+difference+" "+ "will make same "+" = "+s);

    }
}
