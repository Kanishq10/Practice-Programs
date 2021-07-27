package collections;
// import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
// import java.util.List;
import java.util.ListIterator;
public class LinkedLists1 {
    public static void main(String[] args) {
       LinkedList<String> l = new LinkedList<>();// it has similar methods as arraylist + other methods,it implements queues   
        l.add("BTS");
        l.add("Blackpink ");
        l.add("MONSTA X");
        l.add("Seventeen");
        l.add(2,"Neffex");
        l.add("Neffex");
        l.addLast("egzod");// not in array list 
        l.addFirst("K pop"); //not in array list 
        System.out.println(l);
        l.offer("Proxima");//not in array list 
        l.poll();//not in array list
        System.out.println(l);
        l.set(4, "FATRAT");
        l.removeFirst();//not in array list
        l.removeLast();//not in array list
        Object li=l.clone();
        System.out.println(li);
        System.out.println(l);
        System.out.println(l.indexOf("Neffex"));
        System.out.println(l.contains("Seventeen"));
        System.out.println(l.lastIndexOf("Neffex"));
        System.out.println("\n=== Iterate using an iterator() ===");
        Iterator<String> t = l.iterator();
        while (t.hasNext()) {
            String s = t.next();
            System.out.println(s);
        
        
        System.out.println("\n=== Iterate using a listIterator() to traverse in both directions ===");
        // Here, we start from the end of the list and traverse backwards.
        ListIterator<String> k = l.listIterator(l.size());
        while (k.hasPrevious()) {
            String p = k.previous();
            System.out.println(p);
        }
        System.out.println("\n=== Iterate using simple for-each loop ===");
        for(String l1: l) {
            System.out.println(l1);
        }
        System.out.println("\n=== Iterate using for loop with index ===");
        for(int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        System.out.println("\n===Converting LINKED LIST to array===\n");
        Object[] arr=l.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        String [] stringArray = new String[arr.length];
        for(int i =0; i < arr.length; i++) {
           stringArray[i] = (String) arr[i];
        }
        System.out.println("Contents of the array: "+Arrays.toString(stringArray));
    }
    LinkedList<Integer> full=new LinkedList<>();
    full.add(1);
    full.add(2);
    full.add(3);
    full.add(4);
    full.add(5);
    full.add(6);
    full.add(7);
    full.add(8);
    Iterator<Integer> foo=full.iterator();
    while(foo.hasNext()){
        System.out.print(foo.next()+" ");
    }
    System.out.println();
    full.add(0,89);
    full.add(1,12);
    Iterator<Integer> fo2=full.iterator();
    while(fo2.hasNext()){
        System.out.print(fo2.next()+" ");
    }
}
}

