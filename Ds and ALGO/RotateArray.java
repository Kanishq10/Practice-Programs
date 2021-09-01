

import java.util.*;


class RotateArray {  
    static void rotatem1(int arr[],int n,int r){
        int temp[]=new int[r];
        for(int i=0;i<r;i++){
            temp[i]=arr[i];
        }
        int pos=r;
        for(int i=0;i<n-r;i++){
            arr[i]=arr[pos];
            pos++;
        }
        pos=0;
        for(int i=n-r;i<n;i++){
            arr[i]=temp[pos];
            pos++;
        }
    }

    static void reverse(int[] arr,int start,int end){
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void rotatem2(int[] arr, int n, int r) {
        reverse(arr,0,r-1);
        reverse(arr,r,n-1);
        reverse(arr,0,n-1);
    }

	public static void main (String[] args) { //Rotate by n
		//code
		Scanner in= new Scanner(System.in);
		int testCases=in.nextInt();
            while(testCases-- > 0){
                int n=in.nextInt();
                int r=in.nextInt();
                r=r%n; //it will handle the case when r>=n
                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=in.nextInt();
                }
                System.out.print("Original Array");
                for(int x:arr){
                    System.out.print(" "+x);
                }
                System.out.println();
                rotatem1(arr, n, r);
                System.out.print("Rotated array with one method");
                for(int i:arr){
                    System.out.print(" "+i);
                }
                System.out.println();

                
                int arr2[]=new int[n];
                for(int i=0;i<n;i++){
                    arr2[i]=in.nextInt();
                }
                System.out.print("Original arr2ay");
                for(int x:arr2){
                    System.out.print(" "+x);
                }
                System.out.println();
                rotatem2(arr2, n, r);
                System.out.print("Rotated array with 2nd method");
                for(int i:arr2){
                    System.out.print(" "+i);
                }
                System.out.println();
            }
            in.close();
	}
}