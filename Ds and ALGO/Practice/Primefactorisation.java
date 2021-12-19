package Practice;

import java.util.Scanner;

class Primefactorisation {
    //program to print prime factorisation of n
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int div=2;div*div<=n;div++){       //property p*q=n then either p>sqrt(n) and q<sqrt(n)  or  p<sqrt(n) and q>sqrt(n)
            while(n%div==0){
                System.out.print(div+" ");
                n=n/div;
            }
        }
        if(n!=1){
            System.out.print(n);
        }
        in.close();
    }
}
