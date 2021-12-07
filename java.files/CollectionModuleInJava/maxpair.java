package CollectionModuleInJava;

public class maxpair {
    public static void main(String[] args) {
        int arr[]={2,3,5};
        for(int i=0;i<arr.length-2;i++){
          if(arr[i+1]<arr[i+2]){
              System.out.println(arr[i+2]);
          }
          else{
              System.out.println(arr[i+1]);
          }
        }
    }
}
