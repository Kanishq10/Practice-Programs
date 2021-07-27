import java.util.Scanner;
class latestforloop {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=obj.nextInt();
        }
        System.out.print("this is new loop syntax\n");
        for(int r:a){
            System.out.println(r);
        }
        int sum=0;
        for(int x:a){
            sum+=x;
        }
        int mean=sum/a.length;
        System.out.println("mean is "+mean);
        int temp=a[0];
        for(int l=1;l<a.length;l++){
            if(a[l]>temp){
                temp=a[l];
            }
        }
        System.out.println("greatest number is "+temp);
        temp=a[0];
        for(int j=1;j<a.length;j++){
            if(a[j]<temp){
                temp=a[j];
            }
        }
        System.out.println("smallest "+temp);
        obj.close();
    }
}
