package advance__java;

import java.util.*;

public class Comp_arable implements Comparable<Comp_arable> {
	int rollno,age;
	String Name;
	public Comp_arable(String Name,int rollno,int age) {
			this.Name=Name;
			this.rollno=rollno;
			this.age=age;
	}
	
	 public int compareTo(Comp_arable anotherstu) {
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
		List<Comp_arable> s=new ArrayList<Comp_arable>();
		s.add(new Comp_arable("Kanishq",1299,18));
		s.add(new Comp_arable("Rambo",100,15));
		s.add(new Comp_arable("Ironman",2595,40));
		s.add(new Comp_arable("Hawkaye",3987,44));
		s.add(new Comp_arable("Hulk",5000,50));
		s.add(new Comp_arable("Thor",674,1000));
		s.add(new Comp_arable("Wanda",1244,35));
		s.add(new Comp_arable("Batman",5678,60));
		s.add(new Comp_arable("Spiderman",2453,10));
		for(Comp_arable st:s) {
			System.out.println(st.Name+" "+st.rollno+" "+st.age);
		}
		System.out.println("\n");
		Collections.sort(s);
		
		for(Comp_arable st:s) {
			System.out.println(st.Name+" "+st.rollno+" "+st.age);
		}
	}
}