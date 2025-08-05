package Strings;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        String s="hello";
        System.out.println(s);
        System.out.println("enter the character u want to replace ");
        String  c=in.nextLine();
        char creplace=c.charAt(0);
        System.out.println("enter the character to be inserted");
        String cin=in.next();
        for(int i=0;i< s.length();i++){
            if(s.charAt(i)==creplace){
                System.out.print(cin);
                continue;
            }
            else {
                System.out.print(s.charAt(i));

            }
        }
    }
}
