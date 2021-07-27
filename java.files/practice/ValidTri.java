package practice;

import java.util.Scanner;

class ValidTri {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0){
             int a=s.nextInt();
             int b=s.nextInt();
             int c=s.nextInt();
             String valid=(a+b+c==180)?"Yes Valid":"No Not Valid";
             System.out.println(valid);
             t--;
        }
        s.close();
    }
}
