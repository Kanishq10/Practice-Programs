package practice;

class EvenOddIndex {
    public static void main(String[] args) {
        int arr[]={1,2,2,4,5,6,3,8,1,9,5,2,3};
    int sumeven=0;
    int sumodd=0;
    for(int i=0;i<arr.length;i++){
        if(i%2==0  && arr[i]%2==0){
            sumeven+=arr[i];              
        }
        else if(i%2!=0 && arr[i]%2!=0){
            sumodd+=arr[i];
        }
    }
    System.out.println(sumeven+"  "+sumodd);
    }
    
}
