package advance;

import java.util.ArrayList;
import java.util.Vector;

// import collections.Arraylist;

public class Vec1 {
    public static void main(String[] args) {
        Vector v1=new Vector();//default capcity 10
        System.out.println("v1 capcity "+v1.capacity());
        Vector v2=new Vector(20);
        System.out.println("v2 capacity  "+v2.capacity());
        Vector v3 = new Vector(30,10);
        System.out.println("v3 capacity "+v3.capacity());
        v2.add(100);
        v2.add(100);
        v2.add(100); 
        Vector v4=new Vector(v2);
        System.out.println("v4 cpacity "+v4.capacity());
        Vector v=new Vector();
        v.add(1);
        v.add("two");
        v.add(3.0);
        v.add("four");
        v.add(5.000);
        System.out.println(v);
        ArrayList s=new ArrayList();
        s.add(45);
        s.add(15);
        s.add("grg");
        System.out.println(s);

    }
}
