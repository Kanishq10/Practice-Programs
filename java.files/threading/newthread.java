package threading;

 class newthread {
    public static void main(String[] args) {
        System.out.println("Main thread starts here...");
        new A();
        new A();
        new A();
        new A();
        new A();
        new A();
        System.out.println("Main thread ends here...");
    }
}
class A extends Thread {
    
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
    
    public A() {
        this.id = ++count;
        this.start();
    }
}


