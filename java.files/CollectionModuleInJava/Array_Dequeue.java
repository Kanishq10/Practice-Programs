package CollectionModuleInJava;

import java.util.ArrayDeque;

class Array_Dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<>();

        ad.offer(23);
        ad.offerFirst(12);
        System.out.println(ad);
        ad.offerLast(43);
        System.out.println(ad);
        ad.offer(32);
        System.out.println(ad);
        ad.offerFirst(82);
        System.out.println(ad);
        ad.offerLast(46);
        System.out.println(ad);
        ad.poll();
        System.out.println(ad);
        ad.pollFirst();
        System.out.println(ad);
        ad.pollLast();
        System.out.println(ad);
    }    
}
