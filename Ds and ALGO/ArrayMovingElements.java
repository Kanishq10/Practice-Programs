class ArrayMovingElements {
    public static void main(String args[])
     {
         int arr[]={1,2,-3,-4,5,-6,4,-8};
         int l=0,h=0;
         while(h<arr.length){ //it will move negative elements to left ie.order does not matter ,it can also be used for soting upto two numbers
             if(arr[h]<0){
                 int temp=arr[h];
                 arr[h]=arr[l];
                 arr[l]=temp;
                 l++;
             }
             h++;
         }
         for(int i:arr){
             System.out.print(i+" ");
         }
         System.out.println();
         
         int arr2[]={1,2,1,0,0,2,1}; //sort in n complexity only apply upto three numbers
         int low=0,high=arr2.length-1,mid=0;
         while(mid<high){
             if(arr2[mid]==0){
                 int temp=arr2[mid];
                 arr2[mid]=arr2[low];
                 arr2[low]=temp;
                 low++;
                 mid++;
             }
             else if(arr2[mid]==2){
                 int temp=arr2[mid];
                arr2[mid]=arr2[high];
                arr2[high]=temp;
                high--;
             }
             else{
                 mid++;
             }
         }
         for(int i:arr2){
            System.out.print(i+" ");
        }
    }
}