package threading;

 class newthread2 {
    
    public static void main(String[] args) {
        System.out.println("Main thread starts here...");
        new Be();
        new Be();
        new Be();
        new Be();
        new Be();
        
        
        System.out.println("Main thread ends here...");
    }
}
class Be implements Runnable {
    
    private static int count = 0;
    private int id;
    
    public void run() {
        for (int i=1; i<=5; i++) {
            System.out.println("<" + id + ">TICK TICK - " + i);
            
            try {
            Thread.sleep(600);
            } catch (InterruptedException e) {
                
            System.out.println(e);
            }
        }
    }
    
    public Be() {
        this.id = ++count;
        new Thread(this).start();
    }
}
