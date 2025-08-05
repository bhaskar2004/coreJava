package Strings;
import java.util.*;
public class removingFandL {
    public static void flremove(String a){
        System.out.println("removing first and last characters from string");
        char f=a.charAt(0);
        char l=a.charAt(a.length()-1);
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==f || a.charAt(i)==l){
                continue;
            }
            else {
                System.out.print(a.charAt(i));
            }
        }
        System.out.println(" ");
    }

    //counting the number of spaces
    public static void spacecount(String a){
        System.out.println("number of spaces in the string");
        int spacecount=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==' '){
                spacecount+=1;
            }
        }
        System.out.println("the total number of spaces is :"+spacecount);
    }

    //to reverse entire string
    public static void reverse(String a){
        System.out.println("reversing the string");
        for(int i=a.length()-1;i>=0;i--){
            System.out.print(a.charAt(i));
        }
        System.out.println();
    }
    // convert the first letter into upper case and rest is lower case
    public static void fupper(String a){
        System.out.println("convert the first letter into upper case and rest is lower case\n");
        char up=a.charAt(0);
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==up){
               String n=a.toUpperCase();
                System.out.print(n.charAt(i));
            }
            else {
                System.out.print(a.charAt(i));
            }
        }
        System.out.println();
    }

    //removing particular character from string
    public static void delete(String a,char key){
        System.out.println("removing the particular character from string");
        for (int i =0;i<a.length();i++){
            if(a.charAt(i)==key){
                continue;
            }
            else {
                System.out.print(a.charAt(i));
            }
        }
        System.out.println();
    }

    //finding the occurances of a character
    public static void occurs(String a) {
        System.out.println("occurances of characters");
        int []fq=new int[26];
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(c>='a' && c<='z'){
                fq[c-'a']++;
            }
        }
        for(int i=0;i<fq.length;i++){
            if(fq[i]>0){
                System.out.println((char)(i + 'a') + " = " + fq[i]);
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the sting");
        String s=in.nextLine();
        flremove(s);
        spacecount(s);
        reverse(s);
        fupper(s);
        System.out.println();
        System.out.println("enter the key ele to delete");
        String key=in.nextLine();
        char k =key.charAt(0);
        delete(s,k);
        occurs(s);
    }
}
