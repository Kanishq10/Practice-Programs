 class Fibonacci {
    public static int fb(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int x=fb(n-1)+fb(n-2);
        return x;
    }
    static int qb[]=new int[50];
    public static int fbmemoised(int n){    //Dynamic programmed :memoised
        if(n==0) return 0;
        if(n==1) return 1;
        if(qb[n]!=0) return qb[n];
        qb[n]=fb(n-1)+fb(n-2);
        return qb[n];
    }
    
    public static void main(String args[]){

        int n = 11, a = 0, b = 1;

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(a + "  ");

            int sum = a + b;
            a = b;
            b = sum;
        }

        System.out.println("\nNth element is in Fabonacci Series is "+fb(48));
        System.out.println("\nNth element is in Fabonacci Series is "+fb(48));
    }
}
