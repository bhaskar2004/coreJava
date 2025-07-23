import java.util.*;
public class primenumber {
    static  public int prime(int num){
        int res=0;
        for(int i =2; i<num;i++){
            if(num%i==0){
                res=res+1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int num=in.nextInt();
        int c=prime(num);
        if(c==0){
            System.out.println("prime number");
        }
        else {
            System.out.println("not a prime number");
        }
//        System.out.println(c);


    }
}
