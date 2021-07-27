import java.util.Scanner;

class factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            int b=s.nextInt();
            int fact=1;
            while (b>0) {
                fact*=b;
                b--;
            }
        System.out.println(fact);
        
    }
    s.close();
}
}
