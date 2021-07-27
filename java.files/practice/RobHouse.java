package practice;

import java.util.Scanner;

class RobHouse {
   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int k=s.nextInt();
       int sum=0;
       for(int i=1;i<=n;i+=2){
           sum+=k;
       }
       System.out.println(sum);
       s.close();
   } 
}
