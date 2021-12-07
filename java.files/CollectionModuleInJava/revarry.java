package CollectionModuleInJava;
import java.util.ArrayList;

public class revarry {
    public static void main(String[] args) {
        ArrayList<Integer> li=new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(6);
        System.out.println(li);
        ArrayList<Integer> a=new ArrayList<Integer>(); 
         for (int i = li.size()-1; i>=0; i--) {
                a.add(li.get(i));
         }
         System.out.println(a);
    
    }
}
