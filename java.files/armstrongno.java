import java.util.Scanner;
import java.lang.Math;
class armstrongno {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        obj.close();
        int result=isarm(n);
        if(n==result){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
        
    }

    private static int isarm(int num){
        int sum=0;
        int len=(int)(Math.log(num)+1);
        for(int i=1;i<=len;i++){
            int r=num%10;
            sum+=Math.pow(r,len);
            num=num/10;
        }
        return(sum);
    }
}
