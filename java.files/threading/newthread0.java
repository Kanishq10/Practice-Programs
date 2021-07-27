package threading;

class newthread0 {
    public static void main(String[] args) {
        System.out.println("Main thread starts here...");
        new Ae();
        new Ae();
        new Ae();
        new Ae();
        System.out.println("Main thread ends here...");
    }
}
class Ae extends Thread {
    
    private static int count = 0;
    private int id;
    
    public void run() {
        for (int i=1; i<=10; i++) {
            System.out.println("<" + id + ">TICK TICK  " + i);
            
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    
    public Ae() {
        this.id = ++count;
        // this.start();
        run();
    }
}
  

