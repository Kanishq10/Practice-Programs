import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class DIJ{
    Scanner in=new Scanner(System.in);
    int arr[];
    int mat[][];
    DIJ(){
        arr=new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i]=in.nextInt();
        }
        mat=new int[5][5];
    }
    DIJ(int n){
        arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        mat=new int[n][n];
    }
    
    void insert(int v1,int v2,int d){
        int i=-1,j=-1;
        for(int f=0;f<arr.length;f++){
            if(arr[f]==v1){
                i=f;
            }
            if(arr[f]==v2){
                j=f;
            }
        }
        if(i!=-1 && j!=-1){
            mat[i][j]=d;  
            mat[j][i]=d;     //we are overiding the weight
        }
    }

    void dijikstra(int n,int source){
        int a[]=new int[n];
        int status[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.MAX_VALUE;
        }
        a[source]=0;
        Queue<Integer> q=new LinkedList<>();
        q.add(arr[source]);
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                
            }
        }
    }
    void print(){
        System.out.print(" ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(" "+i);
        }
        for (int i = 0; i < mat.length; i++) {
            System.out.print("\n"+i+" ");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
        }
    }
}

class DijsktraALGO {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        DIJ x=new DIJ();
        System.out.println("Want to insert");
        char ans=in.next().charAt(0);
        while(ans=='Y' || ans=='y'){
            x.insert(in.nextInt(), in.nextInt(), in.nextInt());
            System.out.println("More....?");
            ans=in.next().charAt(0);
        }
        x.print();
        x.dijikstra(x.arr.length,in.nextInt());
        in.close();
    }
}
