package advance;

import java.util.*;

// import collections.Arraylist;

public class Vec1 {
    public static void main(String[] args) {
        Vector<Object> v1=new Vector<Object>();//default capcity 10
        System.out.println("v1 capcity "+v1.capacity());
        Vector<Object> v2=new Vector<Object>(20);
        System.out.println("v2 capacity  "+v2.capacity());
        Vector<Object> v3 = new Vector<Object>(30,10);
        System.out.println("v3 capacity "+v3.capacity());
        v2.add(100);
        v2.add(100);
        v2.add(100); 
        Vector<Object> v4=new Vector<Object>(v2);
        System.out.println("v4 cpacity "+v4.capacity());
        Vector<Object> v=new Vector<Object>();
        v.add(1);
        v.add("two");
        v.add(3.0);
        v.add("four");
        v.add(5.000);
        System.out.println(v);
        ArrayList<Object> s=new ArrayList<Object>();
        s.add(45);
        s.add(15);
        s.add("grg");
        System.out.println(s);

    }
}
