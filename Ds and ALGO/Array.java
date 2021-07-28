import java.util.Scanner;

class Array{
    static void  printArray(int arr[],int len){
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[100];

        int len=s.nextInt();
        for(int i=0;i<len;i++){
            arr[i]=s.nextInt();
        }
        // inserting element at last position
        System.out.println("enter new element");
        int el1=s.nextInt();
        
        arr[len]=el1;
         len++;       
        printArray(arr,len);     
        
        // inserting element at given position
        System.out.println("Enter position ");
        int pos=s.nextInt();
        System.out.println("Enter Element");
        int el2=s.nextInt();
        
        for(int i=len;i>pos;i--){
            arr[i]=arr[i-1];
        }   
        arr[pos]=el2;
        len++;
        printArray(arr, len);

        System.out.println("Enter Element position to delete ");
        int pox=s.nextInt();
        for(int i=pox;i<len;i++){
            arr[i]=arr[i+1];
        }
        len--;
        printArray(arr, len);
        s.close();
    }
}