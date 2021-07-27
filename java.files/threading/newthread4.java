package threading;

public class newthread4 {
    public static void main(String[] args) {
        System.out.println("main thread start");
        Thread t=new Thread(new Runs());
        t.start();
        // Thread x=Thread.currentThread();
        // System.out.println("current thread  "+x);
        System.out.println("main thread end");
    }
}
class Runs implements Runnable{
   public void run(){
        try{
        System.out.println("running");}
        catch(Exception e){
            System.out.println("no");
        }
    }
}
