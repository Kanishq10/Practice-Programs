package CollectionModuleInJava;
import java.util.*;
public class Student3 {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<Integer>();
        li.add(2);
        li.add(4);
        li.add(7);
        li.add(1);
        li.add(0);
        li.add(3);
        li.add(-2);
        System.out.println(li);
        Collections.reverse(li);
        System.out.println(li);
        Collections.sort(li);
        System.out.println(li);
        Collections.sort(li,Collections.reverseOrder());
        System.out.println(li);
    }
}
