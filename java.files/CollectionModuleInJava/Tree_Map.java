package CollectionModuleInJava;

import java.util.*;

public class Tree_Map {
    public static void main(String[] args) {
        Map<Integer,String> t=new TreeMap<>();   //sorted on the basis of keys
        t.put(2,"Batman");
        t.put(3,"Superman");
        t.put(1,"Tyson");
        t.put(5,"Haha");
        t.put(0,"Bob");
        t.remove(0);
        for(Integer i:t.keySet()){
            System.out.println(i+" "+t.get(i));
        }
    }
}
