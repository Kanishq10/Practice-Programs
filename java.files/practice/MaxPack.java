package practice;

import java.util.Scanner;

class MaxPack {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0){
            int n=s.nextInt();
            int max=0;
            for(int a=1;a<=n;a++){
                if(n%a>max){
                    max=n%a;
                }
            }
            System.out.println(max);
            t--;
        }
        s.close();
    }
}
