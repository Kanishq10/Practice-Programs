//THIS keyword always points to the current object of class ,
//so it cannot be used in static methods as static method cannot call non static members without theire class
public class thiskeyword {
    String name;
    int age;
    int rollno;
    thiskeyword(String name,int age){
        this.name=name;                 //use of this
        this.age=age;
    }
    thiskeyword(thiskeyword s){   //copy constructor
        name=s.name;
        age=s.age;
        rollno=s.rollno;

    }

    thiskeyword(String name,int age,int rollno){
        this(name,age);                       //calling constructor by this keyword
        this.rollno=rollno;                   //constructor call should be first due to constructor chaining otherwise it will show runtime error
    }
    void show(){
        System.out.println("Name "+name+"  Age "+age+" rollno "+rollno);
    }
}

class constt{
    public static void main(String[] args) {
        thiskeyword obj1=new thiskeyword("kanishq",20);
        thiskeyword obj2=new thiskeyword("salmann",24,129038);
        thiskeyword obj3=new thiskeyword(obj2);               //use of copy constructor
        obj1.show();
        obj2.show();
        obj3.show();

    }
}