package Array;

import java.util.Arrays;

public class halfrev {
    public static void main(String[] args) {
        int []a={1,9,8,7,3};
        int mid=a.length/2;
        int []b=new int[a.length];
        for (int i=mid+1;i<a.length;i++){
            b[i-(mid+1)]=a[i];

        }
        for(int i=0;i<mid+1;i++){
            b[i+mid]=a[i];
        }
        System.out.println(Arrays.toString(b));
    }
}
