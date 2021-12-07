package CollectionModuleInJava;
import java.util.*;
class Student2{
  int rollno;
  String name;
  int age;
  Student2(int rollno,String name,int age){
   this.rollno=rollno;
   this.name=name;
   this.age=age;
  }
}
 class TestCollection3{
 public static void main(String args[]){
  
  Student2 s1=new Student2(101,"Sonoo",23);
  Student2 s2=new Student2(102,"Ravi",21);
  Student2 s3=new Student2(103,"Hanumat",25);
    
  ArrayList<Student2> al=new ArrayList<Student2>();
  al.add(s1);
  al.add(s2);
  al.add(s3);
  
  Iterator<Student2> itr=al.iterator();
  while(itr.hasNext()){
    Student2 st=itr.next();
    System.out.println(st.rollno+" "+st.name+" "+st.age);
  }
 }
}