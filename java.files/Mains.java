public class Mains implements Runnable {
    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());
        // System.out.println("Creating Runnable...");
        Mains runnable = new Mains();
        // System.out.println("Creating Thread...");
        Thread thread=new Thread(runnable);
        // System.out.println("Starting Thread...");
        thread.start();
        try{
            thread.join();
        }catch(InterruptedException e){
            System.out.println("e");
        }
        System.out.println(thread.isAlive());
    }
    @Override
    public void run() {
        System.out.println("Inside : " + Thread.currentThread().getName());
    }
}