package CollectionModuleInJava;

import java.util.*;

public class Studentx {
    int roll;
    String name;
    int age;
    Studentx(int roll,String name,int age){
    this.roll=roll;
    this.name=name;
    this.age=age;

    }
    
}
class Testcollection{
    public static void main(String[] args) {
        Studentx s1 = new Studentx(99,"ram",45);
        Studentx s2=new Studentx(100, "kanishq", 18);
        Studentx s3=new Studentx(123, "shamrm", 24);
        ArrayList<Studentx> al=new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        int i=0;
        while(i<al.size()){
            System.out.println(al.get(i).name);
            i++;
        }
        System.out.println("\n");
        Iterator<Studentx> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().age);
        }
    }
}

