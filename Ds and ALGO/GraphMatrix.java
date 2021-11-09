import java.util.Queue;
import java.util.Scanner;

class GRA{
    Scanner in=new Scanner(System.in);
    int arr[];
    int mat[][];
    GRA(){
        arr=new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i]=in.nextInt();
        }
        mat=new int[5][5];
    }
    GRA(int n){
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

    void BFS(){
        int status[]=new int[arr.length];
        Queue q=new LinkList();
        for (int i = 0; i < mat.length; i++) {
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
class GraphMatrix {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        GRA x=new GRA();
        System.out.println("Want to insert");
        char ans=in.next().charAt(0);
        while(ans=='Y' || ans=='y'){
            x.insert(in.nextInt(), in.nextInt(), in.nextInt());
            System.out.println("More....?");
            ans=in.next().charAt(0);
        }
        x.print();
        in.close();
    }
}
