import java.util.Scanner;

class QDE{
    int arr[]=new int[20];
    int left,right;
    QDE(){
        left=-1;
        right=-1;
    }

    void insertLeft(int data){
        if((left==0 && right==arr.length-1) || (left==right+1)){
            System.out.println("Overflow");
            return;
        }
        if(left==-1 && right==-1){
            left=0;
            right=0;
        }
        else if(left==0){
            left=arr.length-1;
        }
        else{
            left--;
        }
        arr[left]=data;
    }

    void insertRight(int data){
        if((left==0 && right==arr.length-1) || (right==left-1)){
            System.out.println("Overflow");
            return;
        }
        if(left==-1 && right==-1){
            left=0;
            right=0;
        }
        else if(right==arr.length-1){
            right=0;
        }
        else{
            right++;
        }
        arr[right]=data;
    }

    void delLeft(){
        if(right==-1 && left==-1){
            System.out.println("UnderFlow");
            return;
        }
        if(right==left){
            right=-1;
            left=-1;
        }
        else if(left==arr.length-1){
            left=0;
        }
        else{
            left++;
        }
    }

    void delRight(){
        if(right==-1 && left==-1){
            System.out.println("UnderFlow");
            return;
        }
        if(right==left){
            right=-1;
            left=-1;
        }
        else if(right==0){
            right=arr.length-1;
        }
        else{
            right--;
        }
    }

    void print(){
        if(left==-1 && right==-1){
            System.out.println("UnderFlow");
            return;
        }
        if(left>right){
            for(int i=left;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            for(int i=0;i<=right;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        else{
            for (int i = left; i <= right; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}

class QueueDoubleEnded {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        QDE q=new QDE();
        System.out.println("Enter 1 for input restricted or Enter 0 for output restricted"); 
        int inp=in.nextInt();     
        switch(inp){
            case 1:
            System.out.println("Enter no. of elements");
            int n=in.nextInt();
            System.out.println("Enter l for left insertion and r for right insertion");
            char ch=in.next().charAt(0);
            while(n-->0){
                if(ch=='l'){
                    q.insertLeft(in.nextInt());
                }
                else{
                    q.insertRight(in.nextInt());
                }
            }
            q.print();
            System.out.println("Want to delete y/n");
            ch=in.next().charAt(0);
            if(ch=='y'){
                System.out.println("Enter l for left deletion, r for right deletion");
                ch=in.next().charAt(0);
                while(ch=='l' || ch=='r'){
                    if(ch=='l'){
                        q.delLeft();
                    }
                    else{
                        q.delRight();
                    }
                    System.out.println("Enter l or r for further deletion");
                    ch=in.next().charAt(0);
                }
            }
            System.out.println("Queue after deletion");
            q.print(); //complete this
        }  
    }
}
