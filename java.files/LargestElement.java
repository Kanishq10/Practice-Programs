class LargestElement {
    static int Large(int arr[]){
        int large=arr[0],index=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[]={1,5,3,8,5,10,45,23};
        int x=Large(arr);
        System.out.println("Index of largest Element is "+x);
    }
}
