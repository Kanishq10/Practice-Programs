package CollectionModuleInJava;
import java.util.*;
public class traversalls {
    public static void LinkedListTraversalback(LinkedList<Integer> ll){
        ListIterator<Integer> is=ll.listIterator();
        while(is.hasPrevious()){
            System.out.print(is.previous()+" ");
        }
    }
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //taking all the testcases
        int t=sc.nextInt();
        while(t-->0)
        {
            //taking the total number of elements
            int n=sc.nextInt();
            
            LinkedList<Integer>ll=new LinkedList<>();
            for(int i=0;i<n;i++)
            {
                ll.add(sc.nextInt());
            }
            
            //calling the LikedListTraversal method
            LinkedListTraversal(ll);
            LinkedListTraversalback(ll);
}
        sc.close();
}

    public static void LinkedListTraversal(LinkedList<Integer>ll)
{
    //Your code here
    Iterator<Integer> it = ll.iterator();
    while(it.hasNext()){
        System.out.print(it.next()+" ");   //inner working of i.next()=> it prints current element and move pointer to next
    }
}



}