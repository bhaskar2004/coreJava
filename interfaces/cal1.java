package interfaces;

public class cal1 implements simplecalci{
    @Override
    public void add(int a, int b) {
        System.out.println(a+b);

    }

    @Override
    public void sub(int a, int b) {
        System.out.println(a-b);

    }

    @Override
    public void mul(int a, int b) {
        System.out.println(a*b);

    }

    @Override
    public void div(int a, int b) {
        System.out.println(a/b);

    }
}
