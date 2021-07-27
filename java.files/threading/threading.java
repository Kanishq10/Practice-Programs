package threading;
class threading extends Thread {
    String name;
    threading(String s){
    name=s;
    }
    public void run(){
     for(int i=0;i<10;i++){
         System.out.println(name);
         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             System.out.println("hello");
         }
     }
    }
}
class foo{
public static void main(String[] argv) {
   Thread t= new threading("helo");
   t.start();
   (new threading("bye")).start();
   try {
       t.join();
   } catch (Exception e) {
       System.out.println("go go");
   }
   (new threading("help")).start();
}
}
