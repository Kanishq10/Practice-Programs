package Practice;
import java.util.Scanner;

class Squareroot {    public static int sqrt(int n){
    int arr[]=new int[n/2];
    for(int i=0;i<arr.length;i++){
        arr[i]=i+1;
    }
    int low=0,high=arr.length-1;
    int root=-1;
    while(low<=high){
        int mid=(high+low)/2;
        if((arr[mid]*arr[mid])==n){
            root=arr[mid];
            break;
        }
        else if((arr[mid]*arr[mid])<n){
            root=arr[mid];
            low=mid+1;
        }
        else {
            high=mid-1;
        }
    }
    return root;
}
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int res=sqrt(n);
    System.out.println(res);
    in.close();
}
}
