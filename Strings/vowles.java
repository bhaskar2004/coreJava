package Strings;

import java.util.Scanner;

public class vowles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String s=in.next();
        String s1=s.toLowerCase();
        int vowels=0;
        int consonents=0;
        int num=0;
        int specilCharacters=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vowels+=1;
                continue;
            } else if (s1.charAt(i)>='0' && s1.charAt(i)<='9') {
                num+=1;
//            } else if (s.charAt(i)=='!'||s.charAt(i)=='@'||s.charAt(i)=='#'||s.charAt(i)=='$'||s.charAt(i)=='%'||s.charAt(i)=='^'||s.charAt(i)=='&'||s.charAt(i)=='*'|s.charAt(i)=='('||s.charAt(i)==')'||s.charAt(i)=='-'||s.charAt(i)=='+') {
//                specilCharacters+=1;
            }else if(s1.charAt(i)>='!' && s1.charAt(i)<='/'){
                specilCharacters+=1;
            }
            else {
                consonents+=1;
            }
        }
        System.out.println("the vowles :"+vowels);
        System.out.println("the consonants "+consonents);
        System.out.println("the numbers: "+ num);
        System.out.println("the special characters  :"+specilCharacters);
    }
}
