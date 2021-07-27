package practice;

import java.util.Arrays;

class FindMedian {
    public static void main(String[] args) {
        int arr[]={12,56,1,3,6,34,28,97,53,57,26};
        int median,n=arr.length-1;
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        if(n+1%2==0){
            median=(arr[n/2]+arr[(n/2)+1])/2;
        }
        else{
            median=arr[(n+1)/2];
        }
        System.out.println("\nMedian is "+median);

    }
}
