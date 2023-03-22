package CollectionModuleInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Cust implements Comparable<Cust>{
    String name; int no;
    Cust(String n,int r){
        name=n;
        no=r;
    }

    @Override
    public int compareTo(Cust that){   
        return 0;   //we can override it in collections.sort(li, here);
    }

    // @Override
    // public int compareTo(Cust that){   //overriding and compairing
    //     return this.no-that.no;
    // }

    // @Override
    // public int compareTo(Cust that){   //comparing the strings
    //     return this.name.compareTo(that.name);
    // }

    @Override
    public String toString(){
        return this.name+" "+this.no+" ";
    }
}
public class Collections_Class {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(1);
        l.add(2);
        l.add(5);
        l.add(4);
        System.out.println("min ele "+Collections.min(l));
        System.out.println("max ele "+Collections.max(l));
        System.out.println(Collections.frequency(l, 2));
        Collections.sort(l);
        System.out.println(l);
        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);

        Cust c1=new Cust("Riddle", 67);
        Cust c2=new Cust("Bible", 69);
        Cust c3=new Cust("Holi", 67);

        System.out.println(c1.compareTo(c2));
        System.out.println(c2.compareTo(c1));
        System.out.println(c1.compareTo(c3));

        List<Cust> li=new LinkedList<>();
        li.add(new Cust("Stray",23));
        li.add(new Cust("Shasha",95));
        li.add(new Cust("Baba",33));
        li.add(new Cust("Ram",20));
        
        //using comparater sort
        Collections.sort(li,new Comparator<Cust>() {
            @Override
            public int compare(Cust x1,Cust x2){
                return x1.name.compareTo(x2.name);
            }
        });
        System.out.println(li);
    }
}
