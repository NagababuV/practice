package multipleInheritance;

public class C3 implements  A3, B3{
    @Override
    public void fun() {

        A3.super.fun();

        B3.super.fun();

    }

    public static void main(String[] args) {
        C3 c3 = new C3();
        c3.fun();
    }
}
