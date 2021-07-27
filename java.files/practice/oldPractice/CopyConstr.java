package practice.oldPractice;
class Stu{
    int id,roll;
    String name;
    Stu(int a,String b){
        id=a;
        name=b;
    }
    Stu(Stu x,int c){
        id=x.id;
        name=x.name;
        roll=c;
    }
    void print(){
        System.out.println(id+" "+name+" "+roll);
    }
}
class CopyConstr {
    public static void main(String[] args) {
        Stu s1=new Stu(10, "Titanium"),s2=new Stu(s1, 15);
        System.out.println(new Stu(10, "haha")); //constructor returns a class instance there is also constructor class
        s1.print();
        s2.print();
    }
}
