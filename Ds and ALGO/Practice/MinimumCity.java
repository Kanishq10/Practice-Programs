package Practice;
//we are using range update trick
class MinimumCity {//from codequotient
    public static long findMin(int n, int m, int[][] arr) {
        // Write your code here
        long city[]=new long[n];
        for(int i=0;i<m;i++){
          int a=arr[i][0];int b=arr[i][1];long c=arr[i][2];
          city[a-1]+=c;
          if(b<n){
            city[b]-=c;
          }
        }
        long min=Integer.MAX_VALUE;
        long x=0;
        for(int i=0;i<n;i++){
          x+=city[i];
          if(x<min && x!=0){
            min=x;
          }
        }
        return min;
      }
    public static void main(String[] args) {
        int arr[][]={
            {2,4,5},
            {1,3,2},
            {3,5,3}
        };
        System.out.println(findMin(5, 3, arr));
    }
}
