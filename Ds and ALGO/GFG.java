

import java.util.*;


class GFG {
	public static void main (String[] args) { //Rotate by n
		//code
		Scanner in= new Scanner(System.in);
		int testCases=in.nextInt();
            while(testCases-- > 0){
                // write code here
                int n=in.nextInt();
                int r=in.nextInt();
                int arr[]=new int[n];
                int temp[]=new int[r];
                for(int i=0;i<n;i++){
                    arr[i]=in.nextInt();
                }
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
                for(int i:arr){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            in.close();
	}
}