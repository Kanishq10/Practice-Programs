package practice;

 class Person{
    int data;
    private String name;
    static int count=0;
    public Person(){
        count++;
    }
    public Person(int data,String name){  //compile time polymorphism   ie. overloading
        this();
        this.data=data;
        this.name=name;
    }
    void eat(){
        System.out.println("Eating");
    }
    void walk(){
        System.out.println("walking");
    }
}
class Developer extends Person{
    int data;
    protected Developer(int data,String name,int a){
        super(data,name);
        this.data=a;
    }
    protected void print(){
        System.out.println(this.data+" "+super.data+" "+data);
    }
    void walk(){         //run time polymorphism   ie. overriding
        super.walk();    
        System.out.println("developer walking");
    }
}
public class InheritanceInjava {
    public static void main(String[] args) {
        Developer x=new Developer(10,"hacker",23);
        x.walk();
        x.print();
        x.eat();
    }
}

