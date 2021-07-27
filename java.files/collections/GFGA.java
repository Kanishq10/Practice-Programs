package collections;
import java.util.*;
class GFGA {
    public static ArrayList<Integer> getSmaller(ArrayList<Integer> a,int x){
       ArrayList<Integer> f=new ArrayList<>();
       Iterator<Integer> iter=a.iterator();
       while(iter.hasNext()){
           Integer i=iter.next();
           if(i<x){
               f.add(i);
           }
       }

    //    for(Integer i:a){
    //        if(i<x){
    //          f.add(i);
    //        }
    //    }
       return f;
    }
    public static void main (String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int t=sc.nextInt();//taking the number of testcases
        
        while(t-->0)
        {
          //Declaring and Initializing an ArrayList
          ArrayList<Integer>arr=new ArrayList<>();
          
          //taking the total number of elements
          int n=sc.nextInt();
          
          for(int i=0;i<n;i++)
          arr.add(sc.nextInt());
          
          //taking in the the value of k
          int k=sc.nextInt();
          
          //calling the getSmaller method
          ArrayList<Integer>ans=getSmaller(arr,k);
          
          //printing all the numbers which are smaller than k
          for(int i:ans)
          System.out.print(i+" ");
           
          System.out.println();
        }
        sc.close();
    }
}