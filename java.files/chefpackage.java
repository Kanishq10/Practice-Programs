import java.util.Scanner;
class chefpackage {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int r[]=new int[a];
        s.close();
        int k=0;
        for(int i=1;i<=a;i++){
           r[k]=a%(i);
           k++;
        }
        int temp=r[0];
        for(int j=1;j<a;j++){
            if(r[j]>temp){
                temp=r[j];
            }
        }
        System.out.println(temp);
    }
}
