package collections;

import java.util.Iterator;
import java.util.TreeSet;

class TreeSets {
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<>();
        set.add("b");
        set.add("a");
        set.add("d");
        set.add("c");
        set.add("f");
        set.add("e");
        set.add("g");
        System.out.println(set);
        System.out.println("Descending set "+set.descendingSet());
        System.out.println(set.ceiling("d")); //This method returns the least element greater than or equal to e, or null if there is no such element.
       System.out.println(set.floor("d"));//Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
        System.out.println(set.higher("d"));//Returns the least element in this set strictly greater than the given element, or null if there is no such element.
        System.out.println(set.lower("d"));//Returns the greatest element in this set strictly less than the given element, or null if there is no such element.
        Iterator<String> i=set.descendingIterator();
        while(i.hasNext()){
            System.out.print(i.next());
        }
        System.out.println();
        System.out.println(set.first());// first or least element
        System.out.println(set.last());// last or greatest element
        System.out.println(set.headSet("e"));//Returns a view of the portion of this set whose elements are strictly less than toElement.
        System.out.println(set.headSet("e",true));//Returns a view of the portion of this set whose elements are less than (or equal to, if inclusive is true) toElement.
        System.out.println(set.pollFirst());//Retrieves and removes the first (lowest) element, or returns null if this set is empty.
        System.out.println(set.pollLast());//Retrieves and removes the last (highest) element, or returns null if this set is empty.
        System.out.println(set.size());
        System.out.println(set.subSet("a", "d"));
        System.out.println(set.tailSet("c"));
        System.out.println(set.tailSet("c", true));
    }
    }

