package Array;

import java.util.Arrays;

public class projectONArrays {
    public static void main(String[] args) {
        int []a={81,14,91,5,4};
        for(int i=0;i<a.length;i++){
            int sum=0;
            while(a[i]>9){
                int temp=a[i];
                int q=temp/10;
                int r=temp%10;
                sum = sum+r+q;
                a[i]=sum;
                sum=0;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
