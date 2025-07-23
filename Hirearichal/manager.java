package Hirearichal;

import java.security.spec.RSAOtherPrimeInfo;

public class manager {
    String name="ram";
     void checksWork(){
         System.out.println("check the work");
     }

}
class employee extends manager{

    String name="bhaskar";
    void work(){
        System.out.println("manager name : " +super.name);
        System.out.println("employee name : " +this.name);
        System.out.println(this.name+"  working under manager as employee");
    }
}

class salesperson extends manager{

    String name="arjun";
    void sales(){
        System.out.println("manager name : " +super.name);
        System.out.println("employee name : " + this.name);
        System.out.println(this.name +" working under manager as sales person");
    }
}

class Main1{
    public static void main(String[] args) {
        employee e=new employee();
        e.work();
        System.out.println();
        salesperson s=new salesperson();
        s.sales();
        System.out.println();
        manager m=new manager();
        System.out.println(m.name);
        m.checksWork();

    }
}
