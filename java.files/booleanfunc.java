import java.util.Scanner;
class booleanfunc {
    public static void main(String[] args) {
        static boolean match(int ar1,int ar2,m){
            boolean flag=true;
            for(int i=0;i<m;i++){
                if(ar1[i]!=ar2[i]){
                    flag=false;
                }
            }
            return flag;
        }
    Scanner obj=new Scanner(System.in);
    n=obj.nextInt();
    array1=new int[n];
    for(int i=0;i<n;i++){
        array1[i]=obj.nextInt();
    }
    array2=new int[n];
    for(int j=0;j<n;j++){
        array2[j]=obj.nextInt();
    }
    boolean result=match(array1,array2,n);
    obj.close();
}
}
