package advance__java;

import java.util.*;

public class Student implements Comparable<Student> {
	int rollno,age;
	String Name;
	public Student(String Name,int rollno,int age) {
			this.Name=Name;
			this.rollno=rollno;
			this.age=age;
	}
	
	 public int compareTo(Student anotherstu) {
		if(this.age==anotherstu.age) {
			return 0;
		}
		else if (this.age<anotherstu.age) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}
class rec{
	public static void main(String[] args) {
		List<Student> s=new ArrayList<Student>();
		s.add(new Student("Kanishq",1299,18));
		s.add(new Student("Rambo",100,15));
		s.add(new Student("Ironman",2595,40));
		s.add(new Student("Hawkaye",3987,44));
		s.add(new Student("Hulk",5000,50));
		s.add(new Student("Thor",674,1000));
		s.add(new Student("Wanda",1244,35));
		s.add(new Student("Batman",5678,60));
		s.add(new Student("Spiderman",2453,10));
		for(Student st:s) {
			System.out.println(st.Name+" "+st.rollno+" "+st.age);
		}
		System.out.println("\n");
		Collections.sort(s);
		
		for(Student st:s) {
			System.out.println(st.Name+" "+st.rollno+" "+st.age);
		}
	}
}