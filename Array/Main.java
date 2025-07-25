package Array;
import java.util.Scanner;
public class Main {
    public static void add(int[]a){
        int sumEven=0;
        int sunOdd=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                sumEven+=a[i];
            }
            else{
                sunOdd+=a[i];
            }
        }
        System.out.println("even sum of elements "+sumEven);
        System.out.println("odd sum of elements "+sunOdd);
    }
    public static int[] arrayReturn(int []a){

        return a;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int []a=new int[4];
        System.out.println("enter the elements of array");
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }
        add(a);
        int []b=arrayReturn(a);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

    }
}
