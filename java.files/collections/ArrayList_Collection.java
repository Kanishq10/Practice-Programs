package collections;
import java.util.Scanner;
import java.util.*;
class ArrayList_Collection
{
    public static void main(String args[])
    {
        //Creating an object of class Scanner
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();//Taking number of testcases
        while(T>0)
        {
            ArrayList<Integer> A = new ArrayList<Integer>();//Declaraing and Initializing an ArrayList
            int q = sc.nextInt();//Taking number of queries
            
            while(q>0)
            {
                char c = sc.next().charAt(0);
                if(c == 'a')
                {
                    int x = sc.nextInt();
                    add_to_ArrayList(A,x);
                }
                
                if(c == 'b')
                    sort_ArrayList_Asc(A);
                    
                if(c == 'c')
                    reverse_ArrayList(A);
                    
                if(c == 'd')
                    System.out.print(size_Of_ArrayList(A)+" ");
                    
                if(c == 'e')
                    print_ArrayList(A);
                
                if(c == 'f')
                    sort_ArrayList_Desc(A);
                
            q--;
            }
        T--;
        System.out.println();
        }
        sc.close();
    }


public static void add_to_ArrayList(ArrayList<Integer> A, int x)
{
    //Your code here
    //Just add, don't print anything
    
    A.add(x);
}    
public static void sort_ArrayList_Asc(ArrayList<Integer> A)
{
    //Your code here
    //Just sort, don't print anything
     Collections.sort(A);
}
public static void reverse_ArrayList(ArrayList<Integer> A)
{
    //Your code here
    //Just reverse, don't print anything
    Collections.reverse(A);
    
}
public static int size_Of_ArrayList(ArrayList<Integer> A)
{
    //Your code here
    //Return the size of ArrayList
    return A.size();
}
public static void sort_ArrayList_Desc(ArrayList<Integer> A)
{
    //Your code here
    //Just sort in desc order, don't print anything
    Collections.sort(A, Collections.reverseOrder());
    
}
public static void print_ArrayList(ArrayList<Integer> A)
{
    //Your code here
    //Print the elements of A, don't add new line
    for(Integer e : A) 
        { 
            System.out.print(e+" "); 
        } 
    
}
}
