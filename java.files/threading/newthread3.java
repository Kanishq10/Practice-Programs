package threading;

 class newthread3 {
    public static void main(String[] args) {
        System.out.println("Main thread starts here...");
        new Thread(new Af()).start();
    
        Thread t = new Thread(new Af(),"you fool");
        System.out.println(t.getName());
        t.start();
        
        System.out.println("Main thread ends here...");
    }
}
class Af implements Runnable {
    
    private static int count = 0;
    private int id;
    
    public void run() {
        for (int i=1; i<=5; i++) {
            System.out.println("<" + id + ">TICK TICK - " + i);
            
            try {
            Thread.sleep(250);
            } catch (InterruptedException e) {
            System.out.println(e);
            }
        }
    }
    
    public Af() {
        this.id = ++count;
        //new Thread(this).start();
    }
}
