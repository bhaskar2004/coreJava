package comparableInterface;

import java.util.Arrays;
import java.util.Scanner;

public class laptop implements Comparable{
    String name;
    double price;

    public laptop(String name,double price) {
        this.name = name;
        this.price=price;
    }

    @Override
    public int compareTo(Object o) {
        laptop l= (laptop) o;
        if(this.price==l.price){
            return 0;
        }
        if(this.price>l.price){
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter name and price");
        laptop [] a={ new laptop("hp",10000),
                      new laptop("asus",12000),
                      new laptop("lenova",9000),

        };
        Arrays.sort(a);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i].name);
        }

    }
}
