import java.util.Scanner;

class BitOperator{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // or operator
        System.out.println(0 |0);
        System.out.println(0 |1);

        //and opeartor
        System.out.println(1& 10);
        System.out.println(23 & 0);

        //xor operator
        System.out.println(12 ^ 1);   // a^1=~a
        System.out.println(12 ^ 0);   // a^0=a

        //left shift operator
        System.out.println(7 << 3); 

        //right shift operator
        int x=-7;
        System.out.println(Integer.toBinaryString(-7));
        System.out.println(Integer.toBinaryString(x>>2));
        System.out.println(Integer.toBinaryString(x>>>30));

        //question-> on,off,toggle,check specific bit
        System.out.println("Input");
        int n=in.nextInt();
        int i=in.nextInt();
        int j=in.nextInt();
        int k=in.nextInt();
        int m=in.nextInt();
        int onmask=1<<i;
        int offmask=~(1<<j);
        int tmask=(1<<k);
        int cmask=(1<<m);
        System.out.println("output");
        System.out.println(n|onmask);
        System.out.println(n&offmask);
        System.out.println(n^tmask);
        System.out.println((n&cmask)==0?false:true);
    }
}