package Strings;

import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the sting ");
        String s=in.next();
        int count=0;

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j< s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    System.out.println("duplicate found");
                    count=count +1;
                }
            }
        }
        System.out.println("count is :"+count);
    }
}
