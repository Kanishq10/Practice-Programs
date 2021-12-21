package Practice;

import java.util.Scanner;
// program to Print All Permutations Of A String Iteratively
class PrintPermutationString {
    static int fact(int x){
        if(x>=1){
            return x*fact(x-1);
        }
        else{
            return 1;
        }
    }
    static void solution(String str){
		// write your code here
		StringBuilder s=new StringBuilder(str);
		int n=fact(str.length())-1;
		for(int number=0;number<=n;number++){
		    int temp=number;
		    for(int divisor=str.length();divisor>=1;divisor--){
		        int q=temp/divisor;
		        int r=temp%divisor;
		        System.out.print(s.charAt(r));
		        s.deleteCharAt(r);
		        temp=q;
		    }
		    System.out.println();
		    s.append(str);
		}
	}
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
        scn.close();
    }    
}
