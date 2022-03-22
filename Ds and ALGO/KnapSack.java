import java.util.*;
class KnapSack {
    static int maxProfit(int n,int wt,int arr[],int w[]){
        int tw=0;
        int pw[]=new int[n];
        for (int i = 0; i < pw.length; i++) {
            pw[i]=arr[i]/w[i];
        }
        Arrays.sort(pw);
        for (int i = 0; i < pw.length; i++) {
            System.out.println(pw[i]); 
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int capacity=in.nextInt();
        int arr[]=new int[n];
        for (int  i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        int w[]=new int[n];
        for (int i = 0; i < w.length; i++) {
            w[i]=in.nextInt();
        }
        maxProfit(n,capacity,arr,w);
    }
}
