package CollectionModuleInJava;

import java.util.*;
public class HashSET {

	public static void main(String[] args) {
		HashSet<Object> h1=new HashSet<>();
		h1.add(1);
		h1.add("two");
		h1.add("three");
		h1.add(4.00);
		h1.add(6.1);
		h1.add('s');
		//Duplicate values will be ignored
		h1.add("two");
		h1.add(1);
		System.out.println(h1);// order is not maintained by hash set
		System.out.println(h1.contains(6.1));
		h1.add(2);
		h1.add(4);
		h1.add(6);
		h1.add(7);
		h1.add(3);
		h1.add(5.5);
		h1.add(8);
		h1.add(9.7);
		h1.add(11);
		h1.add(45);
		h1.add(34);
		h1.add(32);
		h1.add(112);
		System.out.println(h1);
//		h1.removeIf(num->num%2==0);	
		h1.clear();
		h1.add("Monday");
		h1.add("Tuesday");
		h1.add("Wednesday");
		h1.add("Thursday");
		h1.add("Friday");
		h1.add("Saturady");
		h1.add("Sunday");
		System.out.println(h1);// order is not maintained


		System.out.println("=========================================");
		HashSet<Integer> hm= new LinkedHashSet<>();   //hashset with properties of linkedList
		hm.add(23);
		hm.add(45);
		hm.add(54);
		hm.add(5);
		hm.add(5);
		hm.add(5);
		hm.add(25);
		hm.add(25);
		hm.add(25);
		hm.add(6);
		hm.add(2);
		hm.add(2);
		hm.add(2);
		hm.add(7);
		System.out.println(hm);		
		for (Integer i : hm) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(hm.size());
		hm.remove(54);
		System.out.println(hm);
	}

}
