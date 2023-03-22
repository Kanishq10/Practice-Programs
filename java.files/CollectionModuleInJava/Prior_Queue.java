package CollectionModuleInJava;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Prior_Queue {
    public static void main(String[] args) {
        Queue<Integer> p=new PriorityQueue<>();
        p.offer(5);
        p.offer(10);
        p.offer(8);
        p.offer(3);
        p.offer(32);
        p.offer(29);
        System.out.println(p);;
        p.poll();  //remove element from root which is min element
        System.out.println(p);
        p.poll();
        System.out.println(p);
        p.offer(1);
        System.out.println(p);
        p.poll();
        System.out.println(p);
        p.poll();
        System.out.println(p);

        Queue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder()); //convert to maxHeap
        q.offer(5);
        q.offer(10);
        q.offer(8);
        q.offer(3);
        q.offer(32);
        q.offer(29);
        System.out.println("========================================");
        System.out.println(q);;
        q.poll();  //remove element from root which is max element
        System.out.println(q);
        q.poll();
        System.out.println(q);
        q.offer(1);
        System.out.println(q);
        q.poll();
        System.out.println(q);
        q.poll();
        System.out.println(q);
    }
}
