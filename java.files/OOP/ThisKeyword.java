package OOP;
class Std{
    int fee,rollno,Section;
    String name;
 

    Std(String name,int rollno,int Section){
        this.name=name;
        this.rollno=rollno;
        this.Section=Section;
    }
    Std(String name,int rollno,int Section,int fee){
        this(name,rollno,Section);  //reusing the constructor
        this.fee=fee;
    }
    Std(){
        this(5);//calling another constructor
        System.out.println("1st");
       
    }
    Std(int x){
        this(10,12);
        System.out.println("2nd");
    }
    Std(int z,int f){
        System.out.println("3rd");
    }
    void m(Std d){
        System.out.println("M is invoked");
    }
    void p(){
        m(this);//this as an argument
    }
    void print(){
        System.out.println(name+" "+rollno+" "+Section+" "+fee);
    }
}

class ThisKeyword {
    public static void main(String[] args) {
        Std s1=new Std(),s2=new Std(15),s3=new Std(18, 56);
        Std s4=new Std("Harry", 15, 2);
        Std s5=new Std("Govinda",16,3,500);
        s4.print();
        s5.print();
        s1.p();
        s2.print();
        s3.print();
    }
}
