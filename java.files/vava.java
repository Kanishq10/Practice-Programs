import java.util.*;
public class vava{
    public static void main(String[] args) {
        int arr[]={1,3,5,6,7,8,9};
        for (int i : arr) {
            System.out.print(i);
        }
System.out.println();
        int arr2[]=Arrays.copyOf(arr,4);
        for (int j : arr2) {
           System.out.print(j); 
        }
        System.out.println();
        int arr3[]=Arrays.copyOfRange(arr,2,7);  //7 is not included
        for (int k : arr3) {
           System.out.print(k); 
        }
        
    }
}