package interfaces;

public class cal2 implements basiccalci{
    @Override
    public void mul(int a, int b) {
        System.out.println(a+b);

    }

    @Override
    public void div(int a, int b) {
        System.out.println(a-b);

    }
}
