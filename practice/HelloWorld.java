package practice;

public class HelloWorld{

     public static void main(String []args){
        HelloWorld test = new HelloWorld();
        test.print("Apple"); //
        test.print(10);
        test.print(null);
       }
  public void print(Integer i) {
        System.out.println("Integer");
    }
   public void print(int i) {
        System.out.println("int");
    }
    public void print(Object i) {
        System.out.println("Object");
    }

}