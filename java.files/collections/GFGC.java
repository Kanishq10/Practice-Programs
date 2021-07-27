package collections;
import java.util.*;
class GFGC {
    public static void iterFTB(Iterator i)
{
   while (i.hasNext()) { 
            System.out.print(i.next() + " "); 
        } 
}
    public static void main (String[] args) {
        
        //Creating an object of class Scanner
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//taking all the testcases
        
        while(t-->0)
        {
            int n=sc.nextInt();//taking the total number of elements
            ArrayList<Integer>arr=new ArrayList<>();//Declaring and Intializing an ArrayList
            for(int i=0;i<n;i++)
            {
                int x=sc.nextInt();//taking in the element
                arr.add(x);
            }
            
            Iterator i=arr.iterator();//creating an iterator of ArrayList arr
            
            //calling the iterFTB method and passing the iteraror
            iterFTB(i);
            
            System.out.println();
        }
      sc.close();  
    }
}