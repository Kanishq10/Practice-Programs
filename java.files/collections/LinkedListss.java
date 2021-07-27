package collections;
import java.util.LinkedList;
import java.util.Queue;
class LinkedListss {
    public static void main(String[] args) {
        LinkedList<Integer> li=new LinkedList<Integer>();
        li.add(10);
        li.add(45);
        li.add(40);
        li.add(29);
        li.add(2,50);
        System.out.println(li);
        li.addFirst(499);
        li.addLast(199);
        System.out.println(li);
        Object x=li.clone();
        System.out.println("Object x: "+x);
        System.out.println(li.get(3));
        System.out.println(li.getFirst());
        System.out.println(li.getLast());
        System.out.println(li.contains(40));
        System.out.println(li.element());
        System.out.println(li.indexOf(40));
        li.offer(40);
        System.out.println("list.offer 40 "+li);
        li.offerFirst(1299);
        li.offerLast(6758);
        System.out.println(li);
        System.out.println(li.lastIndexOf(40));
        System.out.println(li.peek());
        System.out.println(li.peekLast());
        System.out.println(li.peekFirst());
        System.out.println(li);
        li.poll();
        System.out.println("list.poll: "+li);
        li.pollLast();
        System.out.println(li);
        li.pollFirst();
        System.out.println(li);
        System.out.println(li.poll());
        System.out.println(li);
        li.pop();
        System.out.println("list.pop: "+li);
        li.push(15678);
        System.out.println(li);
        li.remove();
        System.out.println(li);
        li.remove(0);
        System.out.println(li);
        LinkedList<Integer> li2=new LinkedList<>();
        li2.add(12);
        li2.add(15);
        li2.add(19);
        li2.add(34);
        System.out.println(li2);
        li2.addAll(li);
        li2.addAll(4, li2);
        System.out.println(li2);
        System.out.println("list size "+li2.size());
        li2.removeFirst();
        li2.removeLast();
        li2.set(1, 19);
        System.out.println(li2);
        for(int i=0;i<li2.size();i++){
            for(int j=i+1;j<li2.size();j++){
                if(li2.get(i)==li2.get(j)){
                    li2.remove(j);
                }
            }
        }
        System.out.println("After removing all repeating elements "+li2);
        
        LinkedList<String> s=new LinkedList<>();
        s.add("first");
        s.add("queen");
        s.add("jack");
        s.add("batman");
        s.add("helo");
        s.add("wars");
        s.add("last");
        System.out.println("\n"+s);
        s.push("first");
        s.push("row");
        s.push("col");
        s.push("bol");
        s.push("how");
        s.offer("last");
         System.out.println(s);
         s.pop();
         s.pop();
         s.pop();
         s.pop();
         s.pop();
         s.pop();
         s.pollLast();
         System.out.println(s);
         System.out.println(s.poll());
         System.out.println(s.poll());
         System.out.println(s.poll());
         System.out.println(s.poll());
         System.out.println(s.poll());
         System.out.println(s.poll());
         System.out.println(s.poll());
         System.out.println(s.poll());
         System.out.println(s.poll());
        
         Queue<String> q=new LinkedList<>();
        q.add("first");
        q.add("queen");
        q.add("jack");
        q.add("batman");
        q.add("helo");
        q.add("wars");
        q.add("last");
        System.out.println("\n"+q);
        q.offer("first");
        q.offer("row");
        q.offer("col");
        q.offer("bol");
        q.offer("how");
        q.offer("last");
         System.out.println(q);
         q.poll();
         q.poll();
         q.poll();
         q.poll();
         System.out.println(q);
         System.out.println(q.poll());
         System.out.println(q.poll());
         System.out.println(q.poll());
         System.out.println(q.poll());
         System.out.println(q.poll());
         System.out.println(q.poll());
         System.out.println(q.poll());
         System.out.println(q.poll());
         System.out.println(q.poll());
         try {
            System.out.println(q.element()); //throw error when queue is empty
         } catch (Exception e) {
             System.out.println("q.element() throwing exception=> "+e);
         }
         
        System.out.println(q.peek());


        

    }
}
