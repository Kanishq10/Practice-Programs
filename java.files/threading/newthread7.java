package threading;

public  class newthread7 extends Thread {
    newthread7(){
        super("hello");
        System.out.println("child thread");
        start();

    }
    public void run(){
        try{
        for(int i=1;i<=10;i++){
          System.out.println("child "+i);
          Thread.sleep(500);
        }}
        catch(InterruptedException e){
           System.out.println("child interupted");
        }
    
}
}
 class Mystrey{
    public static void main(String[] args) {
        new newthread7();
        try{
            for(int i=1;i<=10;i++){
                System.out.println("Main"+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("main thread exited");
    }

}
