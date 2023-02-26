package java8featues3;
public class FooImplementation implements Foo {


 

   private static String  msg="naga";

 

    @Override
    public void bar() {
        System.out.println("Hello World1-");

 

    }

    public static void main(String[] args) {


        FooImplementation fi = new FooImplementation();

        System.out.println(fi.HelloWorld());

        fi.bar();    
      System.out.println(Foo.CustomMessage(msg));
    }

 


}