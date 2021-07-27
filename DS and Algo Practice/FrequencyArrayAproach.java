// import java.util.Arrays;      
import java.util.Scanner;

class FrequencyArrayAproach {
    static void printArray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        // find Largest
        int l=arr[0];
        for(int i=0;i<arr.length;i++){
            if (l<arr[i]){
                l=arr[i];
            }
        }
        // find smallest
        
        int sm=arr[0];
        for(int i = 0;i<arr.length;i++){
            if(sm>arr[i]){
                sm=arr[i];
            }
        }
        // Frequency of element array
       int larr[]=new int[l+1];
       for(int i=0;i<arr.length;i++){
            larr[arr[i]]+=1;
       }
       printArray(larr); //This array contains frequency of element and elements are as index
       //find nth largest number
       System.out.println("Enter place for nth largest");
       int nth=s.nextInt();
       int count=1;
       int no=0;
       for(int i=larr.length-1;i>=0;i--){
           if(larr[i]!=0){
               if(count==nth){
                   no=i;
                   break;
               }
               else{
                   count++;
               }
           }
       }
       System.out.println("Nth largest Element is "+no);
       s.close();
}
}
