import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class GRA{
    Scanner in=new Scanner(System.in);
    int arr[];
    int mat[][];
    GRA(){
        arr=new int[5];
        System.out.println("Enter vertices");
        for (int i = 0; i < 5; i++) {
            arr[i]=in.nextInt();
        }
        mat=new int[5][5];
    }
    GRA(int n){
        arr=new int[n];
        System.out.println("Enter vertices");
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

    // void BFS(){
    //     // int status[]=new int[arr.length];
    //     Queue<Integer> q=new LinkedList();
    //     for (int i = 0; i < mat.length; i++) {
    //         for(int j=0;j<mat[i].length;j++){
                
    //         }
    //     }
    // }
    Boolean isCyclic(){    //for non weighted graph
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j){
                    if(mat[i][j]!=0){
                        return true;
                    }
                }
            }
        }
        int count=0;
        for(int i=0;i<mat.length-1;i++){
            for(int j=i+1;j<mat[i].length;j++){
                if(mat[i][j]!=0){
                    count++;
                }
            }
        }
        if(count>=arr.length){
            return true;
        }
        return false;
    }

    Boolean isCyclic(int[][] array){    //for non weighted graph
        int count=0;
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array[i].length;j++){
                if(array[i][j]!=0){
                    count++;
                }
            }
        }
        int v=0;
        for(int i=0;i<mat.length;i++){   //find number of vertices with 0 degree
            Boolean flag=true;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]!=0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                v++;
            }
        }

        if(count>=arr.length-v){
            return true;
        }
        return false;   
    }
    
    int edges(){
        int count=0;
        for(int i=0;i<mat.length-1;i++){
            for(int j=i+1;j<mat[i].length;j++){
                if(mat[i][j]!=0){
                    count++;
                }
            }
        }
        return count;
    }

    int[][] bubbleSort(int arr[][]) { // sorting on the basis of edges in Sde
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j][2] > arr[j + 1][2]) {
                    int t1 = arr[j][0], t2 = arr[j][1], t3 = arr[j][2];
                    arr[j][0] = arr[j + 1][0];
                    arr[j][1] = arr[j + 1][1];
                    arr[j][2] = arr[j + 1][2];
                    arr[j + 1][0] = t1;
                    arr[j + 1][1] = t2;
                    arr[j + 1][2] = t3;
                }
            }
        }
        return arr;
    }

    int[][] kruskalAlgo(){     //for finding minimum spanning tree
        int length=edges();
        int SDE[][]=new int[length][3];
        int k=0;
        for(int i=0;i<mat.length-1;i++){   //entering vertices and weights in SDE
            for(int j=i+1;j<mat[i].length;j++){
                if(i!=j && mat[i][j]!=0){
                    SDE[k][0]=i;
                    SDE[k][1]=j;
                    SDE[k][2]=mat[i][j];
                    k++;
                }
            }
        }
        // print(SDE);
        SDE=bubbleSort(SDE);
        System.out.println();
        int res[][]=new int[mat.length][mat.length];
        //inserting in resultant matrix
        for(int i=0;i<SDE.length;i++){
            res[SDE[i][0]][SDE[i][1]]=SDE[i][2];
            res[SDE[i][1]][SDE[i][0]]=SDE[i][2];
            if(isCyclic(res)){
                res[SDE[i][0]][SDE[i][1]]=0;
                res[SDE[i][1]][SDE[i][0]]=0;
            }
        }
        return res;
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
    void print(int array[][]){
        System.out.print(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+i);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("\n"+i+" ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
        }
    }
}
class GraphMatrix {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        GRA x=new GRA(6);
        System.out.println("Want to insert");
        char ans=in.next().charAt(0);
        while(ans=='Y' || ans=='y'){
            x.insert(in.nextInt(), in.nextInt(), in.nextInt());
            System.out.println("More....?");
            ans=in.next().charAt(0);
        }
        x.print();
        System.out.println();
        System.out.println(x.isCyclic());
        int res[][]=x.kruskalAlgo();
        x.print(res);
        in.close();
    }
}
