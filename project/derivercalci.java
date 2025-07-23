package project;

 abstract class derivercalci extends basiccalci{

     @Override
     void add(int a, int b) {
         System.out.println("addition "+(a+b));
     }

     @Override
     void sub(int a, int b) {
         System.out.println("substracrion "+(a-b));

     }
     abstract void square(int a);
     abstract void cube(int a);
 }
