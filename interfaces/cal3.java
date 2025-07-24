package interfaces;

public class cal3 implements derivedcalci{
    @Override
    public void square(int a) {
        System.out.println(a*a);

    }

    @Override
    public void cube(int b) {
        System.out.println(b*b*b);

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
