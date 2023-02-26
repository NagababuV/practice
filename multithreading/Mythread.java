package multithreading;
public class Mythread extends Thread{
  @Override
   public void run(){
        System.out.println("Hi!! This is from child thread's default run method");
        }
  public void run(String name){
        System.out.println("Hi!! This is from child thread's over loaded method");
        }
  public static void main(String[] args) {
      Mythread mythread=new Mythread();
      mythread.run("HI");
      System.out.println("1");
     mythread.start();
     System.out.println("2");
     
      
      Mythread mt = new Mythread();
      System.out.println("3");
      System.out.println("HI");
      mt.run();
      System.out.println("4");
      mt.start();
     
  }
}

