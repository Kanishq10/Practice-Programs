package CollectionModuleInJava;

import java.util.HashMap;
import java.util.Set;

class Hash_Map {
    public static void main(String[] args) {
        //hashmap stores key value pairs, stores in random order
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India", 1000);
        hm.put("Pakistan", 2000);        
        hm.put("heypa", 3000);        
        hm.put("hellopa", 5000);        
        hm.put("utopia", 3000);        
        hm.put("Dubben", 2000);        
        hm.put("Ukraine", 1000);        
        hm.put("Gobi", 4000);        
        hm.put("Canada", 5000);        
        hm.put("USa", 23000);
        System.out.println(hm);            
        hm.put("Niger",3400);
        hm.put("USa",2343432);
        System.out.println(hm);
        
        System.out.println(hm.get("USa"));
        System.out.println(hm.get("hehe"));

        System.out.println(hm.containsKey("USa"));
        System.out.println(hm.containsKey("bebe"));
        Set<String> keys=hm.keySet();
        System.out.println(keys);
        System.out.println("============================");
        for(String kes:hm.keySet()){
            System.out.print(kes+" ");
            System.out.print(hm.get(kes)+" ");
        }

    }
}

