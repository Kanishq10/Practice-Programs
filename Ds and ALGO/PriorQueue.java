import java.util.Collections;
import java.util.PriorityQueue;

class PriorQueue {
    public static void main(String[] args) {
        //by default less at high priority
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int[] ranks={22,99,3,11,88,4,1};
        for(int val:ranks){
            pq.add(val);
        }
        while(pq.size()>0){
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}
