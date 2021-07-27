package advance__java;
import java.util.*;

public class Var<E>{

	public static void main(String[] args) {
		Vector<Object> v1 = new Vector<>();
		v1.add("B");
		v1.add(4);
		v1.add("U");
		v1.add("Always");
		v1.add(1.0);
		v1.add(2.0);
		v1.add(3.76);
		System.out.println(v1);
		Enumeration<Object> e=v1.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
	}

}
