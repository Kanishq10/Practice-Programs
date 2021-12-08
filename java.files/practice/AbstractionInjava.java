package practice;

public class AbstractionInjava {
    public static void main(String[] args) {
        Audi a=new Audi();
        a.start();
        Car b=new BMW();   //using constructor of child class
        b.start();
        Tata t=new Tata();
        t.start();
        t.run();
        t.transform();
        System.out.println(Truck.data);
    }
}

abstract class Car{   //like a concept class   ,we cannot make its object
    int data;
    abstract void start();     //we must override in child class
    void making(){     //concrete function
        System.out.println("making body");
    }
}

class Audi extends Car{

    @Override
    void start() {
        System.out.println("Audi Engine started");
    }
    
}

class BMW extends Car{

    @Override
    void start() {
        System.out.println("BMW engine started");
    }

}

class Tata implements Truck, OptimusPrime{

    @Override
    public void start() {
        System.out.println("tata starting");
    }

    @Override
    public void run() {
        System.out.println("tata running");
    }

    @Override
    public void transform() {
        System.out.println("transform");
    }
    
}
interface Truck{     //true abstractions   no concrete methods
    public static final int data=2;    //by default
    public abstract void start();
    void run();     //by default public and abstract
}
interface OptimusPrime{
    void transform();
}