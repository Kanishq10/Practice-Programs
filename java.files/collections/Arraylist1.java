package collections;

import java.util.*;
import java.util.function.Predicate;


public class Arraylist1 {
    public static void main(String[] args) {
      ArrayList<Integer> li=new ArrayList<Integer>();
      li.add(4);
      li.add(6);
      li.add(3);
      li.add(2);
      li.add(1);
      li.add(8);
      System.out.println(li);
      ArrayList<Integer> li2 = new ArrayList<>(li);
      System.out.println(li2);
      li2.add(10);
      li2.add(23);
      li2.add(41);
      li2.add(76);
      li.add(4);
      li2.add(2,2827);
      li2.add(4,7856);
      System.out.println(li2);
      List<Integer> li3=new ArrayList<>();
      li3.addAll(li2);
      System.out.println(li3);
      li3.addAll(4, li);
      System.out.println(li3);
      li3.removeAll(li);
      System.out.println(li3);
     
     
      System.out.println("\n"+li);
      li.removeAll(li2);
      System.out.println(li);


      List<String> company=new ArrayList<>();
      System.out.println("\nList is empty "+company.isEmpty());
      company.add("Google");
      company.add("Amazon");
      company.add("Microsoft");
      company.add("Apple");
      System.out.println(company.get(0));
      System.out.println(company.get(1));
      System.out.println(company.get(2));
      System.out.println(company.get(company.size()-1));
      System.out.println("List is empty "+company.isEmpty());
      company.set(0,"Tata");
      company.set(3, "BOAT");
      company.add("Google");
      company.add("Apple");
      company.add("IBM");
      company.add("Alpha");
      company.add("Green GO");
      company.add("Alice");

      System.out.println(company);
      company.remove(3);
      
      System.out.println("After remove(3):  "+company);
      company.remove("Tata");
      System.out.println("After remove(tata):  "+company);
      System.out.println("removing element that is not in company: "+company.remove("hello"));
      company.removeIf(new Predicate<String>(){   //long method
        @Override
        public boolean test(String s){
          return s.startsWith("A");
        }
      });
      company.removeIf(s->s.startsWith("G")); //short method
      System.out.println("After removing elements starts with A and G: "+company);
      company.clear();
      System.out.println("After removing all elements: "+company);
    


    }
}
