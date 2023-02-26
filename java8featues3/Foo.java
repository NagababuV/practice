package java8featues3;
@FunctionalInterface
public interface Foo {
    public default String HelloWorld() {

        return "Hello World from default method";

    }

    public static String CustomMessage(String msg) {
        return msg;

    }

    public void bar();

 

}