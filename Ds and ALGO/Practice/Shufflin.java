//Chef is given an array A consisting of N positive integers. Chef shuffles the array A and creates a new array B of length N, where Bi=(Ai+i)mod2, for each i(1≤i≤N).
//Find the maximum possible sum of integers of the array B, if Chef shuffles the array A optimally.
package Practice;

import java.util.Scanner;

class SHUFFLIN { //problem code:SHUFFLIN =>codechef
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int arr[]=new int[in.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        int even=0;
        int odd=0;
        for (int i : arr) {
            if(i%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        int res=Math.min(even, arr.length/2)+Math.min(odd, arr.length+1/2); //if n is even, odd and even are n/2 and if n is odd, even is n/2 and odd is n+1/2
        System.out.println(res);//  ,so Math.min(odd,(arr.length+1)/2) will work for both conditions
        }
        in.close();
    }
}
