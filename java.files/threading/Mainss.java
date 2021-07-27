package threading;
public class Mainss implements Runnable {
    public void run() {
    System.out.println("Current thread: " + Thread.currentThread());
    }
    public static void main(String args[]) {
      (new Thread(new Mainss(),"lcuy")).start();
      (new Thread(new Mainss(),"haha")).start();
      (new Thread(new Mainss(),"gagal")).start();
    System.out.println("Current thread: " + Thread.currentThread());
    }
}