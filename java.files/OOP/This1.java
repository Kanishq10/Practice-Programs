package OOP;
//THIS keyword always points to the current object of class ,
//so it cannot be used in static methods as static method cannot call non static members without theire class
public class This1 {
    String name;
    int age;
    int rollno;
    This1(String name,int age){
        this.name=name;                 //use of this
        this.age=age;
    }
    This1(This1 s){   //copy constructor
        name=s.name;
        age=s.age;
        rollno=s.rollno;

    }

    This1(String name,int age,int rollno){
        this(name,age);                       //calling constructor by this keyword
        this.rollno=rollno;                   //constructor call should be first due to constructor chaining otherwise it will show runtime error
    }
    void show(){
        System.out.println("Name "+name+"  Age "+age+" rollno "+rollno);
    }
}

class constt{
    public static void main(String[] args) {
        This1 obj1=new This1("kanishq",20);
        This1 obj2=new This1("salmann",24,129038);
        This1 obj3=new This1(obj2);               //use of copy constructor
        obj1.show();
        obj2.show();
        obj3.show();

    }
}