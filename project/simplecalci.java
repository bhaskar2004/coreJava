package project;

abstract class simplecalci extends basiccalci{

    @Override
    void add(int a, int b) {
        System.out.println("addition "+(a+b));

    }

    @Override
    void sub(int a, int b) {
        System.out.println("substraction "+(a-b));

    }

    abstract void mul(int a , int b);
    abstract void div(int a ,int b);
}
