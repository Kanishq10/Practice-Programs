package CollectionModuleInJava;
import java.util.*;
 public class GFG {
    public static void main (String[] args) {
        //Making an of class Scanner
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); //taking testcase
        
        while(t-->0)
        {
            //Taking total number of elements 
            int n=sc.nextInt();
            
            //Declaring and initializing array arr
            int arr[]=new int[n]; 
            for(int i=0;i<n;i++)
            {
                int x=sc.nextInt();
                arr[i]=x;
            }
            
            //Calling the fillArrayList method
            ArrayList<Integer>ans=fillArrayList(arr,n);
            
            //Printing the elements of the array
            for(int x:ans)
            System.out.print(x+" ");
            
            System.out.println();
        }
        sc.close();
    }
    
public static ArrayList<Integer> fillArrayList(int arr[], int n)
{
    //Your code here
    ArrayList<Integer> a=  new ArrayList<Integer>(n); 
    for (int i = 0; i < n; i++) 
                a.add(arr[i]);
                return a;
}

 }