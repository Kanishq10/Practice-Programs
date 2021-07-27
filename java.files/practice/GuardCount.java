package practice;

import java.util.Scanner;

class GuardCount {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        while(t>0){
            int a=s.nextInt();
            int b=s.nextInt();
            int max=a+b;
            int min=(a>b)?a:b;
            System.out.println(min+" "+max);
            t--;
        }
        s.close();
    }
}
